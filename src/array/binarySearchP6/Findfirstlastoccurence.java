package array.binarySearchP6;

public class Findfirstlastoccurence {
    public static void main(String[] args) {
        int[] arr = { 5,7,7,7,7,8,8,10};

        printArray(searchRange(arr,8));
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last = findLast(nums,target);

        return new int[] {first,last};
    }

    public static int findFirst(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while( start <= end) {
            int mid = start + ( end - start ) / 2;

            if ( arr[mid] == target ) {
                ans = mid; // we will store the index in the variable
                end = mid - 1; // and keep checking in the left for any first occurence
            }

            else if ( arr[mid] > target) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int findLast(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while( start <= end) {
            int mid = start + ( end - start ) / 2;

            if ( arr[mid] == target ) {
                ans = mid; // we will store the index in the variable
                start = mid + 1; // and keep checking in the right for the last cocuurencce
            }

            else if ( arr[mid] > target) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void printArray(int[] arr) {
        for ( int num : arr) {
            System.out.print(num + ",");
        }
    }
}
