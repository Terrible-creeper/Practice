public class week5_9 {
    public static void main(String[] args) {
        char[] charArr = {' ','J','a','v','a',' '};
        String str = " JAVA ";
        String str1,str2;
        str1 = new String(charArr);
        str2 = new String("�{���]�p�d�ұХ�");
        System.out.println("str�r��:\"" + str + "\"");
        System.out.println("str1�r��:\"" + str1 + "\"");
        System.out.println("str2�r��:\"" + str2 + "\"");
        System.out.print("str1����:" + str1.length());
        System.out.println(" / str2����:" + str2.length());
        System.out.print("str1��p�g:" + str1.toLowerCase());
        System.out.println(" / str1��j�g:" + str1.toUpperCase());
        System.out.print("str1�R���ťզr��str1.trim(): ");
        System.out.println(str1.trim());
        System.out.print("str�Pstr1�r��O�_�۵�: ");
        System.out.println(str.equals(str1));
        System.out.print("str�Pstr1�O�_�۵�-�����j�p�g: ");
        System.out.println(str.equalsIgnoreCase(str1));
    }
}