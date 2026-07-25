package array.traversalp1.level1;

public class Counteven {
    public static void main() {
        int[] arr = { 1,2,3,4,5,6,7,8};
        System.out.println(numberofEven(arr));
    }

    public static int numberofEven(int[] arr) {
        int count = 0;

        for ( int i : arr) {
            if ( i % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
