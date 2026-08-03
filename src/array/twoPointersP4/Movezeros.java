package array.twoPointersP4;

import static array.twoPointersP4.Reversearray.printArray;

public class Movezeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        printArray(moveZero(arr));
    }

    public static int[] moveZero(int[] arr) {
        int slow = 0;
        int fast = 0;

        while ( fast < arr.length ) {
            if ( arr[fast] != 0 ) {
                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow] = temp;

               slow++;
               fast++;
            }

            else {
                fast++;
            }
        }

        return arr;
    }
}
