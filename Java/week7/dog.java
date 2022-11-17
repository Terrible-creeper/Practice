public class dog extends Animal{
    public String sound (int a,String s) {
        System.out.println(s);
        return "ª¯¥s";
    }
    void color() {
        System.out.println("¦Ç¦â");
    }
    void cry() {
        System.out.println("¨L¨L");
    }
    void eat() {
        System.out.println("dog Ãþ§O");
        System.out.println("-------------------");
    }
    void eattest1() {
        super.eat();
    }
    void eattest2() {
        this.eat();
    }
}
