public class week4_1 {
    static int x = 1;
    static double y = 2.0;
    static void methodA() {
        System.out.print("區域變數宣告前為: ");
        System.out.println(x+" / "+y);
        int x = 3;
        double y = 4.0;
        System.out.print("區域變數宣告後為: ");
        System.out.println(x+ " / "+y);
    }
    static void methodB(int x,double y) {
        System.out.print("方法變數宣告前為: ");
        System.out.println(x+" / "+y);
        x = 3;
        y = 4.0;
        System.out.print("方法變數宣告後為: ");
        System.out.println(x+ " / "+y);
    }
    static void methodC() {
        x=3;y=4.0;
    }
    public static void main(String[] args) {
        System.out.print("呼叫區域變數前: ");
        System.out.println(x + " / " + y);
        methodA();
        System.out.print("呼叫區域變數後: ");
        System.out.println(x + " / " + y);
        System.out.println("--------------------");
        System.out.print("呼叫方法變數前: ");
        System.out.println(x + " / " + y);
        methodB(5,6.0);
        System.out.print("呼叫方法變數後: ");
        System.out.println(x + " / " + y);
        System.out.println("--------------------");
        System.out.print("呼叫類別變數前: ");
        System.out.println(x + " / " + y);
        methodC();
        System.out.print("呼叫類別變數後: ");
        System.out.println(x + " / " + y);
        System.out.println("--------------------");
    }
}