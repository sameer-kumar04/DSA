package array.frequencyCountingP2;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        int k = 2;

        System.out.println(containsNearbyDuplicate(arr,k));
    }

    public static boolean containsNearbyDuplicate(int[] arr,int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for ( int i = 0; i < arr.length; i++) {
            if ( map.containsKey(arr[i])) {
                int diff = i - map.get(arr[i]);
                if ( diff <= k) {
                    return true;
                }
            }
            map.put(arr[i],i);
        }

        return false;

    }
}
