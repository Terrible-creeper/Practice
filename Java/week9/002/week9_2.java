public class week9_2 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.look(new Student() {
            void speak() {
                System.out.println("這是匿名類別中的方法");
            }
        });
    }

}