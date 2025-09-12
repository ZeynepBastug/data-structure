public class BinerySearch {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i;
        }

        System.out.println(binarySearchIteration(arr, 8));

        System.out.println(binarySearchRecursive(arr, 6));
    }

    public static int binarySearchIteration(int[] arr, int data){

        int left = 0;
        int right = arr.length-1;

        while(left<= right){
            int middle = (left + right) / 2;
            if(arr[middle] == data) return middle;
            if(arr[middle] > data)  right = middle -1;
            if(arr[middle] < data) left = middle + 1;
        }
        return -1;

    }
    public static int binarySearchRecursive(int[] arr, int data){
        return binarySearchRecursive(arr, data, 0, arr.length-1);
    }


    public static int binarySearchRecursive(int[] arr, int data, int left, int right){

        if(right < left) return -1;
        int middle = (left + right ) / 2;

        if(arr[middle] == data) return middle;
        if(arr[middle] < data){
            return binarySearchRecursive(arr, data, middle +1, right);
        }else {
            return binarySearchRecursive(arr, data, left , middle -1);

        }
    }

}
