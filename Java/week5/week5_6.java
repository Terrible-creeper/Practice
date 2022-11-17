public class week5_6 {
    public static void main(String[] args) {
        int[] arr1 = {11,21,32,44,35,66,17,38};
        int[] arr2 = new int[8];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        for (int i : arr2) System.out.print(i + " ");
    }
}