package Array.Traversal.Level1;

public class Minelement {
    static void main() {
        int[] arr = { 45,67,89,4,66,8};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
