public class Circle extends shape implements ShapeInterface {
    private double r;
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void area() {
        System.out.println("¶é­±¿n: " + PI*r*r);
    }
    public void perimeter() {
        System.out.println("¶ê©Pªø: " + 2.0*PI*r);
    }
    public void show() {
        System.out.println("X®y¼Ð: " + x);
        System.out.println("Y®y¼Ð: " + y);
        System.out.println("¶ê¥b®|: " + r);
    }
}
