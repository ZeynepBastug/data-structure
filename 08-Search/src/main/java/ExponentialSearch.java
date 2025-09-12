public class ExponentialSearch {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i;
        }

        System.out.println(exponentialSearch(arr, 8));


    }

    public static int exponentialSearch(int[] arr, int data){

        int bound = 1;

        // find proper search window
        while(bound < arr.length && data > arr[bound] ){
            bound *= 2;
        }

        int left = bound /2 ;
        int right = Math.min(bound, arr.length-1);

        // now call binary search for this window (left, right)
        return BinarySearch.binarySearchRecursive(arr, data, left, right);
    }
}
