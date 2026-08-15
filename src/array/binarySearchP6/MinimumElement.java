package array.binarySearchP6;
//LEETCODE 153 : Find Minimum Element in rotated sorted array

public class MinimumElement {
    public static void main(String[] args) {

    }

    public static int findMin(int[] nums) {
        int min = nums[0];
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] <= nums[right]) { //if array is already sorted
                min = Math.min(min, nums[left]);
                break;
            }

            int mid = left + (right - left) / 2;

            min = Math.min(min, nums[mid]);

            if (nums[left] <= nums[mid]) {
                left = mid + 1; //we will check in the right portion
            } else {
                right = mid - 1; // we will check in the left portion
            }
        }
        return min;

    }
}
