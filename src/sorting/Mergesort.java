package sorting;

import java.util.ArrayList;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,4,2,3};

        mergeSort(arr,0,arr.length-1);

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        mS(arr,l,r);
    }

    public static void mS(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = (low + high)/2;

        //Divide
        mS(arr, low, mid);
        mS(arr, mid+1, high);

        //Merge
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while ( left <= mid && right <= high) {
            if ( arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }

            else {
                temp.add(arr[right]);
                right++;
            }
        }

        while ( left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while ( right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
