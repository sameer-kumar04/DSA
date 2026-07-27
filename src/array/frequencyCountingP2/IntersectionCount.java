package array.frequencyCountingP2;

import java.util.HashSet;
import java.util.Set;

public class IntersectionCount {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 2, 3, 5};

        System.out.println(findNumberOfIntersectionElements(arr1,arr2));
    }

    public static int findNumberOfIntersectionElements(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for ( int num : arr1) {
            set.add(num);
        }

        for ( int num : arr2) {
            if ( set.contains(num) ) {
                count++;
                set.remove(num);
            }
        }

        return count;
    }
}
