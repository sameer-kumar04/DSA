package Array.Traversal.Level2;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] arr = { 10,20,30,4};
        findLargestSmallest(arr);
    }

    public static void findLargestSmallest(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > max) {
                max = arr[i];
            }

            if ( arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Largest Element is : " + max);
        System.out.println("Smallest Element is : " + min);
    }
}
