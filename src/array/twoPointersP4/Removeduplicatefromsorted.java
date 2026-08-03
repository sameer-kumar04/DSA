package array.twoPointersP4;

public class Removeduplicatefromsorted {
    public static void main(String[] args ) {
        int[] arr = {0,1,1,2};

        System.out.println(returnNumberOfUnique(arr));
    }

    public static int returnNumberOfUnique(int[] arr) {
        int slow = 0;
        int fast = 1;

        while ( fast < arr.length) {
            if ( arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
                fast++;
            }

            else {
                fast++;
            }
        }

        return (slow+1);
    }

//    class Solution {
//        public int removeDuplicates(int[] nums) {
//            int i = 0;
//
//            for (int j = 1; j < nums.length; j++) {
//                if (nums[i] != nums[j]) {
//                    i++;
//                    nums[i] = nums[j];
//                }
//            }
//
//            return i + 1;
//        }
//    }
}
