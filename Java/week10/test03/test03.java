public class test03 {
    public static void main(String[] args) {
        char[] charArr={'j','a','v','a'};
        String str1 = new String(charArr);
        StringBuffer sb = new StringBuffer(str1);
        System.out.println("str1字串: \""+str1+"\"");
        System.out.println("sb字串: \""+sb+"\"");
        System.out.println("str1長度: "+str1.length());
        System.out.println();

        sb.append("程式設計");
        System.out.println("sb字串: \""+sb+"\"");
        System.out.println("sb長度: "+sb.length());
        System.out.println();

        sb.append("-期中考程式");
        System.out.println("sb字串: \""+sb+"\"");
        System.out.println("sb長度: "+sb.length());
        System.out.println();

        sb.delete(12,14);
        System.out.println("sb字串: \""+sb+"\"");
        System.out.println("sb長度: "+sb.length());
        System.out.println();

        str1 = sb.toString();
        System.out.println("str1字串: \""+str1+"\"");
        System.out.println("str1長度: "+str1.length());
    }
}
