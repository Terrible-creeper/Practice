public class dog_interface implements Animal_interface {
    public void eat() {
        System.out.println("Dog eats");
    }
    public void run() {
        System.out.println("Dog runs");
    }
    public int noOfLegs() {
        return 0;
    }
}
