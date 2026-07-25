package Array.Traversal.Level1;

public class Countzeroes {
    public static void main(String[] args) {
        int[] arr = { 2,4,6,8,9,0,3,0,0,90};

        System.out.println(findZeroes(arr));
    }

    public static int findZeroes(int[] arr) {
        int count = 0;
        for ( int i : arr ) {
            if ( i == 0) {
                count++;
            }
        }

        return count;
    }
}
