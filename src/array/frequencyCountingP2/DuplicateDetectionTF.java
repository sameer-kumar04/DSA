package array.frequencyCountingP2;

import java.util.HashSet;
import java.util.Set;

public class DuplicateDetectionTF {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,2};
        System.out.println(isDuplicatePresent(arr));
    }

    public static boolean isDuplicatePresent(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
