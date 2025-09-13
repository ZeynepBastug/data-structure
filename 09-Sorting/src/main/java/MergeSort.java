import java.util.Arrays;

public class MergeSort {

    // In terms of performance, Merge sort is the best sorting solution: O(nlogn)
    // there is space complexity since we use recursion

    public static void main(String[] args) {

        int[] arr = {5, 2,8,1,4,3,9, 2};

        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void mergeSort(int[] arr) {

        if (arr.length < 2) return;

        int mid = arr.length / 2;

        int[] leftArr = new int[mid];
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        int[] rightArr = new int[arr.length - mid];
        for (int i = 0 ; i < rightArr.length ; i++) {
            rightArr[i] = arr[mid++];

        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(leftArr, rightArr, arr);
    }

    public static void merge(int[] left, int[] right, int[] result){

        int i = 0, j=0, k=0;

        while (i < left.length && j < right.length){

            if(left[i] < right[j]){
                result[k++] = left[i++];
            } else{
                result[k++] = right[j++];
            }
        }

        while(i < left.length) result[k++] = left[i++];
        while(j < right.length) result[k++] = right[j++];
    }
}
