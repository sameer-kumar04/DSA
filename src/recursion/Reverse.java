package recursion;

public class Reverse {
    public static void reverseArray(int[] arr, int i, int n) {
        if ( i >= n / 2) {
            return;
        }

        swap(arr,i,n-i-1);

        reverseArray(arr,i+1,n);
    }

    public static void swap(int[] arr, int left, int right ) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
