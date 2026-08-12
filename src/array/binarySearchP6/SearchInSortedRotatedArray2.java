package array.binarySearchP6;

public class SearchInSortedRotatedArray2 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        System.out.println(findTarget(arr,0));
    }

    public static boolean findTarget(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;

            if ( nums[mid] == target ) {
                return true;
            }

            if ( nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }

            if ( nums[start] <= nums[mid]) { //left half is sorted
                if ( nums[start] <= target && nums[mid] >= target) {
                    end = mid - 1; //we will eliminate the right half
                }

                else{
                    start = mid + 1;
                }
            }

            else { //right half is sorted
                if( nums[mid] <= target && nums[end] >= target ) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
}
