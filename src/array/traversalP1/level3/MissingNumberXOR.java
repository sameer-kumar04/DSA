package array.traversalP1.level3;

public class MissingNumberXOR {
    public static void main(String[] args) {
        int[] arr = {1,3,4};
        System.out.println(findMissing(arr));
    }

    public static int findMissing(int[] arr) {
        int xorArray =0;
        int xorExpected=0;
        int n = arr.length + 1;

        for(int num : arr) {
            xorArray ^= num;
        }

        for ( int i = 1 ; i <= n; i++) {
            xorExpected ^= i;
        }

        return (xorExpected ^ xorArray);
    }
}
