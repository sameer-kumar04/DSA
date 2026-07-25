package array.traversalp1.level3;

public class LongestIncreasingConseSubsequ {
    public static void main(String[] args) {
        int[] arr = { 100,1,200,2,4,3};
        System.out.println(findLongest(arr));
    }

    public static int findLongest(int[] arr) {
        int longest = 0;

        for (int i = 0; i < arr.length; i++) {
            int currLen = 1;
            int currElement = arr[i];

            while ( isPresent(arr,currElement+1)) {
                currElement++;
                currLen++;
            }

            if ( currLen > longest ) {
                longest = currLen;
            }


        }
        return longest;
    }

    public static boolean isPresent(int[] arr,int target) {
        for ( int num : arr) {
            if ( num == target) {
                return true;
            }
        }

        return false;
    }
}
