class Rectangle {
    private double high = 50,wide = 10;
    private double area;
    private void calArea() {
        area = high * wide;
    }
    public Rectangle(double h,double w) {
        high = h;
        wide = w;
        calArea();
    }
    public double getArea() {
        System.out.printf("���� = %.1f ,�e�� = %.1f %n",high,wide);
        return area;
    }
}

public class week4_5 {
    public static void main(String[] args) {
        Rectangle rec3 = new Rectangle(25.3, 12);
        System.out.printf("�x�έ��n = %.1f",rec3.getArea());
    }
}