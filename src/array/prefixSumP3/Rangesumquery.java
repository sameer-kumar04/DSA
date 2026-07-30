package array.prefixSumP3;

public class Rangesumquery {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};

        System.out.println(findSumInRange(arr,0,2));
        System.out.println(findSumInRange(arr,2,5));
        System.out.println(findSumInRange(arr,0,5));
    }

    //Brute_Force_Apporach
//    public static int findSumInRange(int[] arr, int s, int e) {
//        int sum = 0;
//
//        for ( int i = s; i <= e; i++){
//            sum += arr[i];
//        }
//
//        return sum;
//    }

    //Optimized Approach : using prefix sum
    public static int findSumInRange(int[] arr, int left , int right) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        if ( left == 0 ) {
            return prefixSum[right];
        }

        return prefixSum[right] - prefixSum[left - 1];
    }
}
