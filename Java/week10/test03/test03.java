public class test03 {
    public static void main(String[] args) {
        char[] charArr={'j','a','v','a'};
        String str1 = new String(charArr);
        StringBuffer sb = new StringBuffer(str1);
        System.out.println("str1�r��: \""+str1+"\"");
        System.out.println("sb�r��: \""+sb+"\"");
        System.out.println("str1����: "+str1.length());
        System.out.println();

        sb.append("�{���]�p");
        System.out.println("sb�r��: \""+sb+"\"");
        System.out.println("sb����: "+sb.length());
        System.out.println();

        sb.append("-�����ҵ{��");
        System.out.println("sb�r��: \""+sb+"\"");
        System.out.println("sb����: "+sb.length());
        System.out.println();

        sb.delete(12,14);
        System.out.println("sb�r��: \""+sb+"\"");
        System.out.println("sb����: "+sb.length());
        System.out.println();

        str1 = sb.toString();
        System.out.println("str1�r��: \""+str1+"\"");
        System.out.println("str1����: "+str1.length());
    }
}
