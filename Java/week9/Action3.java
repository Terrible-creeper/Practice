import static java.lang.System.out;
public enum Action3 implements Command {
    RIGHT {
        public void execute() {
            out.println("播放右轉動畫");
        }
    },
    LEFT {
        public void execute() {
            out.println("播放左轉動畫");
        }
    }
}
