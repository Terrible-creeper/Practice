import yaml
import spotipy
import tkinter as tk
import urllib.request
import urllib.error
from PIL import Image, ImageTk

with open("config.yml","r") as data: #讀取config.yml內的資料
    config = yaml.load(data, Loader=yaml.FullLoader)
    
class App: #創建APP
    def __init__(self, master): #初始化APP
        self.SongID = "-1"
        frame = tk.Frame(master)
        frame.pack()
        self.label = tk.Label(frame)
        self.label.pack()
        frame2 = tk.Frame(master)
        frame2.pack()
        tk.Label(frame2, text="播放時間:").grid(row=0, column=0)
        self.time_text = tk.StringVar()
        tk.Label(frame2, textvariable=self.time_text).grid(row=0, column=1)
        tk.Label(frame2, text="標題:").grid(row=1, column=0)
        self.title_text = tk.StringVar()
        tk.Label(frame2, textvariable=self.title_text).grid(row=1, column=1)
        tk.Label(frame2, text="演唱者:").grid(row=2, column=0)
        self.artist_text = tk.StringVar()
        tk.Label(frame2, textvariable=self.artist_text).grid(row=2, column=1)
    def time(self,t): #將毫秒轉換為時間單位
        hour = t // 3600000
        t = t % 3600000
        min = t // 60000
        t = t % 60000
        sec = t // 1000
        if hour > 0:
            return "{:02d}:{:02d}:{:02d}".format(hour, min, sec)
        else:
            return "{:02d}:{:02d}".format(min, sec)
    def update_info(self): #每次迴圈所更新的資料
        global current_track
        current_track = token.currently_playing()
        if current_track == None: #如果資料=None
            if self.SongID != "0": #如果當前SongID不為0
                self.SongID = "0"
                img = Image.open("invisibility.png").resize((128,128))
                self.image = ImageTk.PhotoImage(img)
                self.label.config(image=self.image)
                self.time_text.set("00:00 / 00:00")
                self.title_text.set("目前尚未開始撥放")
                self.artist_text.set("")
        else : 
            if self.SongID != current_track["item"]["album"]["id"]: #如果當前SongID不為目前撥放的音樂
                track_name = current_track["item"]["name"]
                artist = current_track["item"]["artists"][0]["name"]
                download_img()
                img = Image.open("image.jpg").resize((128,128))
                self.image = ImageTk.PhotoImage(img)
                self.label.config(image=self.image)
                self.SongID = current_track["item"]["album"]["id"]
                self.title_text.set(track_name)
                self.artist_text.set(artist)
            self.time_text.set(self.time(current_track["progress_ms"]) + " / " + self.time(current_track["item"]["duration_ms"]))
        self.label.after(100, self.update_info) #於100毫秒後運行updata_info

def download_img(): #下載當前歌曲圖片
    try:
        urllib.request.urlretrieve(current_track["item"]["album"]["images"][0]["url"], "image.jpg")
    except urllib.error.ContentTooShortError: #若下載失敗，則重新下載
        print("Network error,REDOWNLOADING.......")
        download_img()
        

oauth = spotipy.util.prompt_for_user_token( #使用者憑證設定
    username=config['username'],
    scope=config['scopes'],
    client_id=config['clientID'],
    client_secret=config['clientSecret'],
    redirect_uri=config['redirectURI'])
token = spotipy.Spotify(auth=oauth) #驗證使用者憑證

root = tk.Tk() #Tkinter初始化
root.resizable(False,False) #禁止縮放視窗
root.geometry("500x200") #視窗大小
app = App(root) #將Tkinter套入APP中
app.update_info() #運作update_info
root.mainloop() #開啟視窗
