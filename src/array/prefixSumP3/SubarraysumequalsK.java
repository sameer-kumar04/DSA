package array.prefixSumP3;

public class SubarraysumequalsK {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(findSubarraySumsEqualK(arr,3));
    }

    //BRUTE FORCE APPROACH
    public static int findSubarraySumsEqualK(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if ( sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
