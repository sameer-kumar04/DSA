package array.binarySearchP6;
//Floor of a number : means a return the greatest number which is smaller than or equal to the target
public class Floorofanumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        System.out.println(findFloor((arr),15));
    }

    public static int findFloor(int[] arr , int target) {

        if ( arr.length == 0) {//for the empty array
            return -1;
        }

        if ( target < arr[0] ) { //if the target element is the smaller than the smallest element in the array
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while ( start <= end ) {
            int mid = start + (end - start) / 2;

            if ( arr[mid] == target) {
                return mid;
            }

            else if ( arr[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return arr[end];
    }
}
