package array.binarySearchP6;
//LEETCODE : 35
public class Searchinsertposition {
    public static void main(String[] args) {
        int[] arr = { 1,2,4,5,6};
        System.out.println(findInsertPositionOrSearch(arr,3));
    }

    public static int findInsertPositionOrSearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int answer = nums.length;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;

            if( nums[mid] >= target ){
                answer = mid;
                end = mid - 1;
            }

            else {
                start = mid + 1;
        }
    }
    return answer;
}
}
