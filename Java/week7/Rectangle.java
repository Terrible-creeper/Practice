public class Rectangle extends Shape{
    private double x1;
    private double y1;
    public Rectangle(double x, double y,double x1,double y1) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }
    public void area() {
        System.out.println("����έ��n: " + (y1-y)*(x1-x));
    }
}
