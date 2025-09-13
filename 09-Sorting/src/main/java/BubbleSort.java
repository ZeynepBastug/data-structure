import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,9,2,8};

        System.out.println("bubbleSort(arr) = " + Arrays.toString(bubbleSort(arr)));

    }

    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length-1 ; j++) {
                
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swap = true;
                }
                
            }
            if(!swap){
                return arr;
            }

        }
        return arr;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
