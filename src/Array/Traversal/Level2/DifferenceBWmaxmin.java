package Array.Traversal.Level2;

public class DifferenceBWmaxmin {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(findDifference(arr));
    }

    public static int findDifference(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for( int num : arr) {
            if ( num > max) {
                max = num;
            }

            if ( num < min ) {
                min = num;
            }
         }

        return (max - min);
    }
}
