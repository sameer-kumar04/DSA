package array.traversalP1.level1;

public class Countpositive {
    public static void main(String[] args) {
        int[] arr = { -2,-4,-5,2,3,4,56,6};
        System.out.println(findPositive(arr));
    }

    public static int findPositive(int[] arr) {
        int count = 0;
        for ( int i : arr) {
            if ( i > 0) {
                count++;
            }
        }

        return count;
    }
}
