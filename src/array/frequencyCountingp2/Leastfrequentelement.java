package array.frequencyCountingp2;

import java.util.HashMap;
import java.util.Map;

public class Leastfrequentelement {
    public static void main(String[] args) {
        int[] arr = {2,5,2,1,5,2};
        System.out.println(findLeastFrequentELe(arr));
    }

    public static int findLeastFrequentELe(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int minFrequency = Integer.MAX_VALUE;
        int answer = -1;

        for ( int num : arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for ( Map.Entry<Integer,Integer> e : map.entrySet()) {
            if ( e.getValue() < minFrequency ) {
                minFrequency = e.getValue();
                answer = e.getKey();
            }


        }

        return answer;

    }
}
