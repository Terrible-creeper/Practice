import static java.lang.System.out;
public class week9_5 {
    public static void main(String[] args) {
        play(Action.RIGHT);
    }
    public static void play(int action) {
        switch(action) {
            case Action.RIGHT:
                out.println("����V�k�ʵe");
                break;
            case Action.LEFT:
                out.println("����V���ʵe");
                break;
            default:
                out.println("���䴩���ʧ@");
        }
    }
}
