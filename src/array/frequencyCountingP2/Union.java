package array.frequencyCountingP2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};

        System.out.println(findUnion(arr1,arr2));
    }

    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for ( int num : arr1 ) {
            set.add(num);
        }

        for ( int num : arr2) {
            set.add(num);
        }

        for ( int num : set) {
            result.add(num);
        }

        return result;
    }
}
