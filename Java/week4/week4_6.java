public class week4_6 {
    public static void main(String[] args) {
        Account A = new Account(2000);
        Account B = new Account(4000);
        System.out.println("�b��A(��l): " + A.getBalance());
        System.out.println("�b��B(��l): " + B.getBalance());
        A.withdraw(1000);
        B.deposit(1000);
        System.out.println("�b��A(�����): " + A.getBalance());
        System.out.println("�b��B(�����): " + B.getBalance());
        A.addInterest(1);
        System.out.println("�b��A(�Q��1%): " + A.getBalance());
    }
}