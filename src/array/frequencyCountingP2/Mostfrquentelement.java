package array.frequencyCountingP2;

import java.util.HashMap;
import java.util.Map;

public class Mostfrquentelement {
    public static void main(String[] args) {
        int[] arr = {2,5,2,1,5,2};
        System.out.println(findMostFrequentELe(arr));
    }

    public static int findMostFrequentELe(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxFrequency = 0;
        int answer = -1;

        for ( int num : arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for ( Map.Entry<Integer,Integer> e : map.entrySet()) {
            if ( e.getValue() > maxFrequency ) {
                maxFrequency = e.getValue();
                answer = e.getKey();
            }


        }

        return answer;

    }
}
