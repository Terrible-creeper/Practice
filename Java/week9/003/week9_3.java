public class week9_3 {
    public static void main(String[] args) {
        A a = new A();
        a.f(new Show() {
            public void show() {
                System.out.println("這是實現介面的匿名類別");
            }
        });
    }
}
