public class B extends A{
    int z;
    B(int x,int y) {
        super(x,y);
        z=300;
    }
    B() {
        super();
        z=800;
    }
    public void f() {
        System.out.printf("x=%d,y=%d,z=%d\n",x,y,z);
    }
}
