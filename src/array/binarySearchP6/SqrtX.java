package array.binarySearchP6;
//LEETCODE 69 QUESTION
public class SqrtX {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(findSqaureRoot(x));
    }

    public static int findSqaureRoot(int x) {
        int start = 0;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    return end; // end points to the largest integer whose square is less than or equal to x
    }
}
