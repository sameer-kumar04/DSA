package Array.Traversal.Level1;

public class Sumofarray {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(findSum(arr));
    }

    public static int findSum(int[] arr) {
        int sum = 0;

        for ( int i : arr) {
            sum += i;
        }

        return sum;
    }
}
