public class triangle extends shape{
    public triangle(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public double area() {
        return x*y/2;
    }
}
