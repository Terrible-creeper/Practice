public class week7_7 {
    public static void main(String[] args) {
        Shape s;
        Circle c = new Circle(5.0, 10.0, 4.0);
        Rectangle r = new Rectangle(10.0, 10.0, 20.0, 20.0);    
        for (int i = 1; i <= 2; i++) {
            if(i==1) s = c;
            else s = r;
            s.area();
        }
    }
}