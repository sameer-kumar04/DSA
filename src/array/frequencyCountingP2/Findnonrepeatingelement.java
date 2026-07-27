package array.frequencyCountingP2;

import java.util.HashMap;
import java.util.Map;

public class Findnonrepeatingelement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,3,5};
        System.out.println(findNonRepeatingEle(arr));
    }

    public static int findNonRepeatingEle(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for ( int num : arr ) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        for ( int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }
}
