package array.frequencyCountingp2;

import java.util.HashSet;
import java.util.Set;

public class Containsduplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(isDuplicate(arr));
    }

    public static boolean isDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for ( int num : arr ) {
            if ( !set.add(num)) {
                return true;
            }
        }

        return false;
    }
}
