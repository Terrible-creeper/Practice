public class week5_8 {
    public static void main(String[] args) {
        char[] charArr = {' ','J','a','v','a',' '};
        StringBuffer sb = new StringBuffer("use");
        String str = " JAVA ";
        String str1,str2;
        str1 = new String(charArr);
        str2 = new String("�{���]�p�d�ұХ�");
        System.out.println("str�r��:\"" + str + "\"");
        System.out.println("str1�r��:\"" + str1 + "\"");
        System.out.print("str1����:" + str1.length());
        System.out.println(" / str2����:" + str2.length());
        System.out.print("str�Pstr1�r��O�_�۵�: ");
        System.out.println(str.equals(str1));
    }
}