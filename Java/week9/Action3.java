import static java.lang.System.out;
public enum Action3 implements Command {
    RIGHT {
        public void execute() {
            out.println("����k��ʵe");
        }
    },
    LEFT {
        public void execute() {
            out.println("������ʵe");
        }
    }
}
