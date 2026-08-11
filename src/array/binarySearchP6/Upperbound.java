package array.binarySearchP6;

public class Upperbound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};

        System.out.println(findUpperBound(arr,55));
    }

    public static int findUpperBound(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;

            if ( arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            }

            else { //if arr[mid] <= target
                start = mid + 1;
            }
        }

        return ans;
    }
}
