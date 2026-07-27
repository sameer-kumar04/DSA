package array.traversalP1.level1;

public class Countodd {
    public static void main(String[] args) {
        int[] arr =  { 1,2,3,4,5,6,7,8,9};

        System.out.println(Numberodd(arr));
    }

    public static int Numberodd(int[] arr) {
        int count = 0;
        for ( int i : arr) {
            if ( i % 2 != 0) {
                count++;
            }
        }

        return count;
    }
}
