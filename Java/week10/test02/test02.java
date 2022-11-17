import java.util.Scanner;

class triangle {
    private double a;
    private double b;
    public double area() {
        return a*b/2;
    }
    public triangle(double a,double b) {
        this.a = a;
        this.b = b;
    }
}

public class test02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入三角形 底");
        int a = sc.nextInt();
        System.out.println("請輸入三角形 高");
        int b = sc.nextInt();
        
        triangle tr = new triangle(a, b);
        System.out.println("三角形面積為" + tr.area());
        sc.close();
    }
}