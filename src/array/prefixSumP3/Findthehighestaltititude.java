package array.prefixSumP3;
//LEETCODE 1732: Find the highest altitude
public class Findthehighestaltititude {
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] arr) {
        int[] prefix = new int[arr.length+1];

        prefix[0] = 0;
        for ( int i = 1; i <= arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i-1];
        }

        return findMax(prefix);
    }

    public static int findMax(int[] arr) {
        int max = 0;
        for ( int num : arr ) {
            if ( num > max ) {
                max = num;
            }
        }

        return max;
    }


    //without prefix sum : TC = O(n) and SC = O(1)
//    public static int largestAltitude(int[] arr) {
//        int current = 0;
//        int max = 0;
//
//        for ( int num : arr) {
//            current += num;
//            max = Math.max(current,max);
//        }
//
//        return max;
//    }
}
