package array.traversalp1.level3;

import java.util.ArrayList;

public class Leadersinarray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(findLeader(arr).toString());
    }

    public static ArrayList<Integer> findLeader(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            boolean isLeader = true;
            for ( int j = i+1; j < arr.length; j++) {
                if(arr[j] > current) {
                    isLeader= false;
                    break;
                }

            }
            if ( isLeader) {
                result.add(current);
            }
        }

        return result;
    }
}
