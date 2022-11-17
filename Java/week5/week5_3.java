public class week5_3 {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "楊過";  names[1] = "小龍女";
        names[2] = "金庸";  names[3] = "江小魚";
        names[4] = "陳浩南";
        for (String string : names) System.out.println("\"" + string + "\"(字串長度:" + string.length() + ")");
    }
}