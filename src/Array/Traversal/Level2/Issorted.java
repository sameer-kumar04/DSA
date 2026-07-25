package Array.Traversal.Level2;

public class Issorted {
    public static void main(String[] args) {
        int[] arr = {2, 1, 45, 67};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
