package array.traversalP1.level1;

public class LinearSearch {
    public static void main() {
        int[] arr = { 3,5,7,9,30};

        System.out.println(findTarget(arr,30));
    }

    public static int findTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target) {
                return i;
        }
        }

        return -1;
    }
}
