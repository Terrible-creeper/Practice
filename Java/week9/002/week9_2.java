public class week9_2 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.look(new Student() {
            void speak() {
                System.out.println("�o�O�ΦW���O������k");
            }
        });
    }

}