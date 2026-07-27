package array.frequencyCountingp2;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String str1, String str2) {
        Map<Character,Integer> map = new HashMap<>();

        if ( str1.length() != str2.length() ) { //if both have different length
            return false;
        }

        for ( char ch : str1.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for ( char ch1 : str2.toCharArray() ) {
            if ( !map.containsKey(ch1)) {
                return false;
            }

            else {
                map.put(ch1,map.get(ch1)-1);
                if ( map.get(ch1) < 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
