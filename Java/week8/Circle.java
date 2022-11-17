public class Circle extends shape implements ShapeInterface {
    private double r;
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void area() {
        System.out.println("�魱�n: " + PI*r*r);
    }
    public void perimeter() {
        System.out.println("��P��: " + 2.0*PI*r);
    }
    public void show() {
        System.out.println("X�y��: " + x);
        System.out.println("Y�y��: " + y);
        System.out.println("��b�|: " + r);
    }
}
