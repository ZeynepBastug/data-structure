import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9,2,1,7,0};

        System.out.println(Arrays.toString(insertingSort(arr)));
    }

    public static int[] insertingSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int toBeInserted = arr[i]; // save current value in a  variable called toBeInserted
            int j = i-1; // predecessor


            // This is where we do shifting operation
            while (j >= 0 && arr[j] > toBeInserted){
                // shift elements
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = toBeInserted; // put toBeInserted in its place
        }
        return arr;
    }
}
