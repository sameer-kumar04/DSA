package array.binarySearchP6;
//Ceiling of a number : means a return the smallest number which is greater than or equal to the target
public class Ceilingofanumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        System.out.println(findCeilingOfANumber(arr,17));
    }

    public static int findCeilingOfANumber(int[] arr, int target) {
        if ( arr.length == 0) {//for the empty array
            return -1;
        }


        if ( target > arr[arr.length - 1] ){//if the target element is greater than the greatest element in the array
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int answer = -1;

        while ( start <= end ) {
            int mid = start + (end - start) / 2;

            if ( arr[mid] >= target ){
                answer = mid; //potential answer found
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }

        }

        return answer;
    }
}
