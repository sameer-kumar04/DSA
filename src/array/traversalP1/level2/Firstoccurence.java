package array.traversalP1.level2;

public class Firstoccurence {
    public static void main(String[] args) {
        int[] arr = {2,4,6,2,10};
        System.out.println(findFirstOccurence(arr,2));
    }

    public static int findFirstOccurence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
