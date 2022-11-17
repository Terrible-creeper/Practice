import static java.lang.System.out;
public class week9_5 {
    public static void main(String[] args) {
        play(Action.RIGHT);
    }
    public static void play(int action) {
        switch(action) {
            case Action.RIGHT:
                out.println("播放向右動畫");
                break;
            case Action.LEFT:
                out.println("播放向左動畫");
                break;
            default:
                out.println("不支援此動作");
        }
    }
}
