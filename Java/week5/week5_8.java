public class week5_8 {
    public static void main(String[] args) {
        char[] charArr = {' ','J','a','v','a',' '};
        StringBuffer sb = new StringBuffer("use");
        String str = " JAVA ";
        String str1,str2;
        str1 = new String(charArr);
        str2 = new String("程式設計範例教本");
        System.out.println("str字串:\"" + str + "\"");
        System.out.println("str1字串:\"" + str1 + "\"");
        System.out.print("str1長度:" + str1.length());
        System.out.println(" / str2長度:" + str2.length());
        System.out.print("str與str1字串是否相等: ");
        System.out.println(str.equals(str1));
    }
}