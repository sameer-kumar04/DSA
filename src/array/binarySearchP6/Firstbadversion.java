package array.binarySearchP6;
//LeetCode 278 : First Bad version
public class Firstbadversion {
    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int answer = -1;

        while ( start <= end ) {
            int mid = start + (end - start) / 2;


            if ( isBadVersion(mid) ) {
                answer = mid; //we will store the bad version
                end = mid - 1; // and check if is there any bed version before it
            }

            else {
                start = mid + 1;
            }
        }

        return answer;
    }

    private boolean isBadVersion(int mid) { //just the mimic of badversion api
        if ( mid == 5) {
            return true;
        }

        return false;
    }


}
