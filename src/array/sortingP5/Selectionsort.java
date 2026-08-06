package array.sortingP5;

import static array.twoPointersP4.Reversearray.printArray;

public class Selectionsort {
    public static void main() {
        int[] arr = {5,4,3,2,1};
        doSelectionSorting(arr);

        printArray(arr);
    }

    public static void doSelectionSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallestIndex = i;
            for ( int j = i + 1; j<n; j++) {
                if ( arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }
}
