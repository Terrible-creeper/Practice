class Some {
    void someMethod(int i) {
        System.out.println("i被呼叫");
    }
    void someMethod() {
        System.out.println("無參數傳遞被呼叫");
    }
}
public class week4_4 {
    public static void main(String[] args) {
       var s = new Some();
       s.someMethod();
       s.someMethod(0);
    }
}