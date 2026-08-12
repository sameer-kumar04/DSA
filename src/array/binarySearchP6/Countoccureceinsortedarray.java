package array.binarySearchP6;

public class Countoccureceinsortedarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,8,8,8,8,9,11};
        int target = 8;
        System.out.println(countOccurrences(arr,target));
    }

    public static int countOccurrences(int[] arr, int target) {
        // Your code goes here

        int numberOfOccurrence = findUpperBound(arr, target) - findLowerBound(arr, target);

        return numberOfOccurrence;


    }

    public static int findLowerBound(int[] arr, int target) { //give us the first index of the target
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

    public static int findUpperBound(int[] arr, int target) { //gives us the index of element just greater than the target

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
