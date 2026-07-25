package array.frequencyCountingp2;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {2,5,2,1,5,2};
        findFrequency(arr);
    }

    public static void findFrequency(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for( int num : arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "->" + e.getValue());
        }
    }
}
