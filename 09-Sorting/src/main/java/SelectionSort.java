public class SelectionSort {

    public static void main(String[] args) {

    }


    public static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int minIdx = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }

            }
            swap(arr, arr[i], arr[minIdx]);

        }
        return arr;
    }

    public static void swap(int[] arr , int idx1, int idx2){

        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

    }
}
