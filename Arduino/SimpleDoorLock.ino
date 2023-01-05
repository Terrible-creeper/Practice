#include <WiFi.h>
#include <SPI.h>
#include <MFRC522.h>
#include <ESP32Servo.h>
#include <MySQL_Connection.h>
#include <MySQL_Cursor.h>

#define RST_PIN       0
#define MISO_PIN      12
#define MOSI_PIN      13
#define SCK_PIN       14
#define SS_PIN        15
#define INSERT_PIN    27
#define BUZZER_PIN    26
#define LED_PIN       25

char    ssid[]        = "A";
char    password[]    = "0902201173";
int     MYSQLPort     = 25003;
char    user[]        = "ESP32";
char    pass[]        = "61sOxaPe";

String  NowID         = "";
long    LastTime      = millis() - 6000;

IPAddress server_addr(138,3,217,33);
MFRC522 rfid(SS_PIN, RST_PIN);
WiFiClient client;
MySQL_Connection conn((Client *)&client);

void setup() {
  Serial.begin(115200);
  pinMode(BUZZER_PIN,OUTPUT);
  pinMode(LED_PIN,OUTPUT);
  pinMode(INSERT_PIN,INPUT);
  initWIFI();
  initDatabase();
  initRFID();
}

void loop() {
  if (!rfid.PICC_IsNewCardPresent()) return;
  if (!rfid.PICC_ReadCardSerial()) return;
  String ID = B2H(rfid.uid.uidByte);
  if ((millis() - LastTime) >= 5000 || ID != NowID) { //"每過5秒 或 目前讀取的ID不為最後讀取的ID" 後運行一次
    NowID = ID;
    if (digitalRead(INSERT_PIN) == HIGH) SQLInsert(ID);
    else 
      if (SQLSelect(ID)) {
        Serial.println("Found...");
        tone(BUZZER_PIN,2349,100);
        tone(LED_PIN,100,100);
      } else Serial.println("Not found...");
    LastTime = millis();
  }
}

void SQLInsert(String ID) { //資料庫寫入ID
  Serial.print("Insert ID = "); Serial.println(ID);
  char command[128];
  char insert[] = "INSERT IGNORE INTO ESP32.card (ID) VALUES ('%s')";
  sprintf(command,insert,ID);
  MySQL_Cursor *cur_mem = new MySQL_Cursor(&conn);  
  cur_mem->execute(command);
  cur_mem->close();
  delete cur_mem;
}

bool SQLSelect(String ID) { //資料庫讀取ID
  Serial.print("Select ID = "); Serial.println(ID);
  bool Status = false;
  char command[128];
  char select[] = "SELECT * FROM ESP32.card WHERE ID = '%s' LIMIT 1";
  sprintf(command,select,ID);
  MySQL_Cursor *cur_mem = new MySQL_Cursor(&conn);
  cur_mem->execute(command);
  column_names *cols = cur_mem->get_columns();
  row_values *row = NULL;
  do {
    row = cur_mem->get_next_row();
    if (row != NULL)
      if(String(row->values[0]) == ID) Status = true;
  } while (row != NULL);
  delete cur_mem;
  return Status;
}

void initRFID() {     //初始化RFID模組
  Serial.println("/------RFID------/");
  SPI.begin(SCK_PIN,MISO_PIN,MOSI_PIN);
  rfid.PCD_Init();
  rfid.PCD_DumpVersionToSerial();
  Serial.println("RFID inited");
}

void initDatabase() {   //初始化資料庫連線
  Serial.println("/------Database------/");
  if (conn.connect(server_addr, MYSQLPort, user, pass)) Serial.println("Database inited");
  else Serial.println("Connection Failed...");
}

void initWIFI() {       //初始化WIFI連線
  Serial.println("/------WIFI------/");
  Serial.print("Connecting to "); Serial.print(ssid);
  WiFi.begin(ssid, password);  
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  Serial.println();
  Serial.println("WIFI inited");
}

String B2H(byte b[]) {    //將2進制資料轉換成16進制
    String hexstring = "";
    for(int i = 0; i < 4; i++) {
      if(b[i] < 0x10) hexstring += '0';
      hexstring += String(b[i], HEX);
    }
    return hexstring;
}
