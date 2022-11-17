public class week7_4 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        dog d = new dog();
        d.eat();
        System.out.println("super呼叫父類別方法 ");
        d.eattest1();
        System.out.println("this 呼叫父類別方法 ");
        d.eattest2();
    }
}