import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�п�J�T���� ��");
        int x = sc.nextInt();
        System.out.println("�п�J�T���� ��");
        int y = sc.nextInt();
        
        triangle t = new triangle(x,y);
        System.out.println("�T���έ��n�� " + t.area());
        sc.close();
    }
}
