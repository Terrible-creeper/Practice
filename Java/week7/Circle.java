public class Circle extends Shape{
    public double r;
    public Circle(double x,double y,double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void area() {
        System.out.println("¶é­±¿n: " + 3.1415926*r*r);
    }
}