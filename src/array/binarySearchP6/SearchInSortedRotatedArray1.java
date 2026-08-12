package array.binarySearchP6;

public class SearchInSortedRotatedArray1 {
    public static void main() {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findTarget(arr,6));
    }

    public static int findTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;

            if ( arr[mid] == target ) {
                return mid;
            }

            if ( arr[start] <= arr[mid]) { //left half is sorted
                if ( arr[start] <= target && arr[mid] >= target) {
                    end = mid - 1; //we will eliminate the right half
                }

                else{
                    start = mid + 1;
                }
            }

            else { //right half is sorted
                if( arr[mid] <= target && arr[end] >= target ) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
