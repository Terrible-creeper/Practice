public class week4_1 {
    static int x = 1;
    static double y = 2.0;
    static void methodA() {
        System.out.print("�ϰ��ܼƫŧi�e��: ");
        System.out.println(x+" / "+y);
        int x = 3;
        double y = 4.0;
        System.out.print("�ϰ��ܼƫŧi�ᬰ: ");
        System.out.println(x+ " / "+y);
    }
    static void methodB(int x,double y) {
        System.out.print("��k�ܼƫŧi�e��: ");
        System.out.println(x+" / "+y);
        x = 3;
        y = 4.0;
        System.out.print("��k�ܼƫŧi�ᬰ: ");
        System.out.println(x+ " / "+y);
    }
    static void methodC() {
        x=3;y=4.0;
    }
    public static void main(String[] args) {
        System.out.print("�I�s�ϰ��ܼƫe: ");
        System.out.println(x + " / " + y);
        methodA();
        System.out.print("�I�s�ϰ��ܼƫ�: ");
        System.out.println(x + " / " + y);
        System.out.println("--------------------");
        System.out.print("�I�s��k�ܼƫe: ");
        System.out.println(x + " / " + y);
        methodB(5,6.0);
        System.out.print("�I�s��k�ܼƫ�: ");
        System.out.println(x + " / " + y);
        System.out.println("--------------------");
        System.out.print("�I�s���O�ܼƫe: ");
        System.out.println(x + " / " + y);
        methodC();
        System.out.print("�I�s���O�ܼƫ�: ");
        System.out.println(x + " / " + y);
        System.out.println("--------------------");
    }
}