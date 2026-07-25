package array.frequencyCountingp2;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};
        System.out.println(removeDuplicates(arr));
    }

    public static Set<Integer> removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for ( int num : arr) {
            set.add(num);
        }

        return set;
    }
}
