public class dog extends Animal{
    public String sound (int a,String s) {
        System.out.println(s);
        return "���s";
    }
    void color() {
        System.out.println("�Ǧ�");
    }
    void cry() {
        System.out.println("�L�L");
    }
    void eat() {
        System.out.println("dog ���O");
        System.out.println("-------------------");
    }
    void eattest1() {
        super.eat();
    }
    void eattest2() {
        this.eat();
    }
}
