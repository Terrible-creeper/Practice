import java.util.Scanner;

public class week4_3 {
    static double convert2F(double c) {
        double f;
        f = (9.0*c) /5.0+32.0;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�п�J���ū�: ");
        double c = sc.nextDouble();
        double f = convert2F(c);
        System.out.println("��� " + c + " =" + " �ؤ� " + f);
    }
}
