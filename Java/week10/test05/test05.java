import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入三角形 底");
        int x = sc.nextInt();
        System.out.println("請輸入三角形 高");
        int y = sc.nextInt();

        interface_triangle t = new interface_triangle(x, y);
        t.area();
        sc.close();
    }
}
