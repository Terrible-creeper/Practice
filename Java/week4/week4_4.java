class Some {
    void someMethod(int i) {
        System.out.println("i�Q�I�s");
    }
    void someMethod() {
        System.out.println("�L�Ѽƶǻ��Q�I�s");
    }
}
public class week4_4 {
    public static void main(String[] args) {
       var s = new Some();
       s.someMethod();
       s.someMethod(0);
    }
}