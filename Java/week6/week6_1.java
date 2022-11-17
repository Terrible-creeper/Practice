public class week6_1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("程式");
        char[] charArr = {'J','a','v','a'};
        System.out.println("原始字串內容: " + sb);
        sb.append('-');
        System.out.println("新增字元\'-\': "+ sb);
        sb.append(charArr,0,4);
        System.out.println("新增字元陣列: "+ sb);
        sb.append("程式範例教本");
        System.out.println("新增字串: "+ sb);
        sb.deleteCharAt(2);
        System.out.println("刪除第3個字: "+ sb);
        sb.delete(0, 2);
        System.out.println("刪除前2個字: "+ sb);
        sb.insert(6,"設計");
        System.out.println("插入中文字串: "+ sb);
        sb.insert(4,"SE");
        System.out.println("插入英文字串: "+ sb);
        sb.setCharAt(4, 'E');
        System.out.println("取代字元: "+ sb);
        sb.replace(0, 7, "JDK SE");
        System.out.println("取代字串: "+ sb);
        sb.reverse();
        System.out.println("反轉後字串: "+ sb);
    }
}