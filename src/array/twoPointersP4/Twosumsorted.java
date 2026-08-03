package array.twoPointersP4;

public class Twosumsorted {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};

        printArray(findTwoSum(arr,18));
    }

    public static int[] findTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while ( left < right) {
            int sum = arr[left] + arr[right];

            if ( sum == target) {
                return new int[]{left,right};
            }

            else if ( sum > target) {
                right--;
            }

            else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }

    public static void printArray(int[] arr) {
        for ( int num : arr) {
            System.out.print(num+" ");
            System.out.println();
        }
    }
}
