package Array.Traversal.Level2;

public class Secoundlargest {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,890,9};
        System.out.println(findSecoundLargest(arr));
    }

    public static int findSecoundLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secoundLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > firstLargest ) {
                secoundLargest = firstLargest;
                firstLargest = arr[i];
            }

            else if( arr[i] < firstLargest && arr[i] > secoundLargest) {
                secoundLargest = arr[i];
            }
        }

        return secoundLargest;
    }
}
