package Array.Traversal.Level2;

public class CountNumGreaterThanX {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(countNum(arr,3));
    }

    public static int countNum(int[] arr, int target) {
        int count = 0;

        for(int i : arr) {
            if ( i > target) {
                count++;
            }
        }

        return count;
    }
}
