package array.traversalp1.level2;

public class Secoundsmallest {
    public static void main(String[] args) {
        int[] arr = { 3,6,4,2,10};
        System.out.println(findSecoundSmallest(arr));
    }

    public static int findSecoundSmallest(int[] arr) {
        int firstSmallest = Integer.MAX_VALUE;
        int secoundSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < firstSmallest) {
                secoundSmallest = firstSmallest;
                firstSmallest = arr[i];
            }

            else if( arr[i] > firstSmallest && arr[i] < secoundSmallest) {
                secoundSmallest = arr[i];
            }
        }

        return secoundSmallest;
    }
}
