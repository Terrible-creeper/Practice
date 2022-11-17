public class Submarine implements Swimmer {
    private String name;
    public Submarine(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.printf("¼ç¤ô¸¥ %s ¼ç¦æ\n", name);
    }
}
