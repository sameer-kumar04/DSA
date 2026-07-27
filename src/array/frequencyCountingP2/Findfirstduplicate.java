package array.frequencyCountingP2;

import java.util.HashSet;
import java.util.Set;

public class Findfirstduplicate {
    public static void main(String[] args) {
        int[] arr = { 1,2,5,5,3,3};
        System.out.println(returnFirstDuplicate(arr));
    }

    public static int returnFirstDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for ( int num : arr ) {
            if ( !set.add(num) ) {
                return num;
            }
        }

        return -1;
    }
}
