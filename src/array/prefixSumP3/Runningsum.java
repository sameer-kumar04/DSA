package array.prefixSumP3;

public class Runningsum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = runningSum(arr);
        printArray(result);
    }

    public static int[] runningSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1 ; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        return prefix;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
