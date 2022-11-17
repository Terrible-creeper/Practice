import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入三角形 底");
        int x = sc.nextInt();
        System.out.println("請輸入三角形 高");
        int y = sc.nextInt();
        
        triangle t = new triangle(x,y);
        System.out.println("三角形面積為 " + t.area());
        sc.close();
    }
}
