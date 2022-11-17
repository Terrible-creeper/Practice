public class Account {
    private double balance;
    public Account() {
        this.balance = 0;
    }
    public Account(double b) {
        this.balance = b;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amt) {
        balance = balance + amt;
    }
    public void withdraw(double amt) {
        balance = balance + amt;
    }
    public void addInterest(double rate) {
        double amt = balance * rate / 100;
        deposit(amt);
    }
}