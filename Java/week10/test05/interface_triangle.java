public class interface_triangle implements interface_shape{
    public double x;
    public double y;
    public interface_triangle(double x,double y) {
        this.x = x;
        this.y = y;
    };

    public void area() {
        show_shape a = new show_shape() {
            void show() {
                System.out.println("�T���έ��n�� " + x*y/2);
            }
        };
        a.show();
    }
    
}
