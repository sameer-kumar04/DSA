package array.traversalp1.level2;

import java.util.ArrayList;

public class FindAllOccurence {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,2,4,2};
        System.out.println(findAllOccurence(arr,2).toString());
    }

    public static ArrayList<Integer> findAllOccurence(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target) {
                result.add(i);
            }
        }

        return result;
    }
}
