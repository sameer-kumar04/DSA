package array.frequencyCountingP2;

import java.util.HashSet;
import java.util.Set;

public class ReturnDuplicate {
    public static void main() {
        int[] arr = {1, 2, 3, 2, 5, 3, 3};
        System.out.println(findDuplicate(arr));
    }

    public static Set<Integer> findDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for ( int num : arr ) {
            if( !seen.add(num) ) {
                duplicate.add(num);
            }
        }

        return duplicate;
    }
}
