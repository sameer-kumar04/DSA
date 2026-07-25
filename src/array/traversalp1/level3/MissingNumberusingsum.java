package array.traversalp1.level3;

public class MissingNumberusingsum {
    public static void main(String[] args) {
        int[] arr = {1,4,3};
        System.out.println(findMissing(arr));
    }

    public static int findMissing(int[] arr) {
        long sum = 0;
        int n = arr.length + 1;

        for ( int num : arr ) {
            sum += num;
        }

        long expSum = (long)n*(n+1)/2;

        long missing = expSum - sum;

        return (int)missing;
    }
}
