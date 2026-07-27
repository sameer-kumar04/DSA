package array.traversalP1.level3;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(findMajorityElement(arr));
    }

    public static int findMajorityElement(int[] arr) {
        int majority = arr.length/2;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if ( arr[j] == current) {
                    count++;
                }
            }
            if ( count > majority) {
                return current;
            }
        }
        return -1;
    }
}
