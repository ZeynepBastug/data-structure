public class JumpSearch {

    public static int jumpSearch(int[] arr, int data){
         int blockSize = (int) Math.sqrt(arr.length);
         int start = 0;
         int next = blockSize;
         // Make jumps in next block until finding the block where data is in the range
         while(start < arr.length && data >  arr[blockSize-1]){
             start = next;
             next += blockSize;

             if (next > arr.length) next = arr.length;
         }

         // Now I have found block I will make a linear search
        for (int i = start ; i < next ; i++) {
            if(data == arr[i]) return arr[i];
        }

        return -1;

    }
}
