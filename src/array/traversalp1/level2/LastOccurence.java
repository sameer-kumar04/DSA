package array.traversalp1.level2;

public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = { 2,4,56,2,3};
        System.out.println(findLast(arr,2));
    }

    public static int findLast(int[] arr, int target) {
        for( int i = arr.length - 1; i >= 0; i--) {
            if ( arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
