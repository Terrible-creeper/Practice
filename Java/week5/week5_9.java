public class week5_9 {
    public static void main(String[] args) {
        char[] charArr = {' ','J','a','v','a',' '};
        String str = " JAVA ";
        String str1,str2;
        str1 = new String(charArr);
        str2 = new String("程式設計範例教本");
        System.out.println("str字串:\"" + str + "\"");
        System.out.println("str1字串:\"" + str1 + "\"");
        System.out.println("str2字串:\"" + str2 + "\"");
        System.out.print("str1長度:" + str1.length());
        System.out.println(" / str2長度:" + str2.length());
        System.out.print("str1轉小寫:" + str1.toLowerCase());
        System.out.println(" / str1轉大寫:" + str1.toUpperCase());
        System.out.print("str1刪除空白字元str1.trim(): ");
        System.out.println(str1.trim());
        System.out.print("str與str1字串是否相等: ");
        System.out.println(str.equals(str1));
        System.out.print("str與str1是否相等-不分大小寫: ");
        System.out.println(str.equalsIgnoreCase(str1));
    }
}