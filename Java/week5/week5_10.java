public class week5_10 {
    public static void main(String[] args) {
        char[] charArr = {' ','J','a','v','a',' '};
        String str = " JAVA ";
        String str1,str2;
        str1 = new String(charArr);
        str2 = new String("�{���]�p�d�ұХ�");
        System.out.println("str�r��:\"" + str + "\"");
        System.out.println("str1�r��:\"" + str1 + "\"");
        System.out.println("str2�r��:\"" + str2 + "\"");
        System.out.println("str1.indexOf(\'a\',2): " + str1.indexOf('a',2));
        System.out.println("str1.lastIndexOf(\'b\',2): " + str1.lastIndexOf('b',2));
        System.out.println("�^��str1.charAt(3): " + str1.charAt(3));
        System.out.println("����str2.substring(2,6): " + str2.substring(2,6));
    }
}