import java.util.Arrays;

public class week5_7 {
    public static void main(String[] args) {
        int[] org = new int[] {1,2,3,4,5};
        System.out.println("��l�}�C " + "");
        for (int i = 0; i < org.length; i++)
            System.out.print(org[i] + " ");
        int[] copy = Arrays.copyOf(org, 7);
        System.out.println("\n��l�}�C���ƻs:");
        for (int i = 0; i < copy.length; i++) 
            System.out.print(copy[i]+ " ");
    }
}