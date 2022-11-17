public class week4_6 {
    public static void main(String[] args) {
        Account A = new Account(2000);
        Account B = new Account(4000);
        System.out.println("帳戶A(初始): " + A.getBalance());
        System.out.println("帳戶B(初始): " + B.getBalance());
        A.withdraw(1000);
        B.deposit(1000);
        System.out.println("帳戶A(交易後): " + A.getBalance());
        System.out.println("帳戶B(交易後): " + B.getBalance());
        A.addInterest(1);
        System.out.println("帳戶A(利息1%): " + A.getBalance());
    }
}