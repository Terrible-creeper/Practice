import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�п�J�T���� ��");
        int x = sc.nextInt();
        System.out.println("�п�J�T���� ��");
        int y = sc.nextInt();

        interface_triangle t = new interface_triangle(x, y);
        t.area();
        sc.close();
    }
}
