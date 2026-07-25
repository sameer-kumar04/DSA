package Array.Traversal.Level1;

public class Findaverage {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(findAvg(arr));
    }

    public static float findAvg(int[] arr) {
        int sum = 0;
        float avg = 0;
        for ( int i : arr) {
            sum += i;
        }

        avg = (float)sum / arr.length;

        return avg;
    }
}
