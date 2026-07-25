package Array.Traversal.Level1;

public class Maxelement {
    public static void main() {
        int[] arr = { 34,56,78,90,556};
        System.out.println(findMax(arr));
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
