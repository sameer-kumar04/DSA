package array.sorting;

import static array.twoPointersP4.Reversearray.printArray;

public class Bubblesort {

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        bubbleSorting(arr);

        printArray(arr);
    }

    public static void bubbleSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isSwap =false;

            for (int j = 0; j < n - i -1; j++) {
                if ( arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    isSwap = true;
                }
            }

            if ( !isSwap ) { //array is already sorted
                return;
            }
        }
    }
}
