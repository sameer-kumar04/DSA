package array.twoPointersP4;

import static array.twoPointersP4.Reversearray.printArray;

public class Squareofsortedarray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};

        printArray(findSquareOfSortedArray(arr));
    }

    public static int[] findSquareOfSortedArray(int[] arr) {
        int[] result = new int[arr.length];

        int write = result.length - 1;

        int left = 0;
        int right = arr.length - 1;

        while ( left <= right ) {
            if ( Math.abs(arr[left]) > Math.abs(arr[right])) {
                result[write] = arr[left] * arr[left];
                left++;
                write--;
            }

            else {
                result[write] = arr[right] * arr[right];
                right--;
                write--;
            }
        }

        return result;
    }
}
