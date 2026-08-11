package array.binarySearchP6;

public class Lowerbound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,30,30,30,40,50};

        System.out.println(findLowerBound(arr,35));
    }

    public static int findLowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;

            if ( arr[mid] >= target) {
                ans = mid; //potential answer
                end = mid - 1; //we will check in the left for lower index where condition is true
            }

            else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
