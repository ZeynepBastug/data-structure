public class TernarySearch {

    public static void main(String[] args) {

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(ternarySearchRecursive(arr, 15));
        System.out.println(ternarySearchIterative(arr, 10));

    }

    public static int ternarySearchRecursive(int[] arr, int data){
        return ternarySearchRecursive(arr, data, 0, arr.length-1);
    }

    public static int ternarySearchRecursive(int[] arr, int data, int left, int right){
        if(left > right) return -1;

        int partition = (right-left) /3;

        int mid1 = left + partition;
        int mid2 = right - partition;

        if(arr[mid1] == data) return mid1;
        if(arr[mid2] == data) return mid2;

        if(arr[mid1] > data){
            right = mid1 -1;
            return ternarySearchRecursive(arr, data, left, right);
        } else if (arr[mid2] < data){
            left = mid2 + 1;
            return ternarySearchRecursive(arr, data,left, right);
        } else {
            left = mid1 + 1;
            right = mid2 -1;
            return ternarySearchRecursive(arr, data, left, right);
        }

    }

    public static int ternarySearchIterative(int[] arr, int data){

        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int partition =(right - left) /3;

            int mid1 = left + partition;
            int mid2 = right - partition;

            if(arr[mid1] == data) return mid1;
            if(arr[mid2] == data) return mid2;

            if(data < arr[mid1]) {
                right = mid1 -1;
            } else if(data > mid2){
                left = mid2 +1;
            } else {
                left = mid1 +1;
                right = mid2 -1;
            }


        }
        return -1;

    }





}
