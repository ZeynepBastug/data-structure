import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskLongestRange {
    public static void main(String[] args) {
        int[] array = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        System.out.println(Arrays.toString(longestRange(array)));
    }

    public static int[] longestRange(int[] arr){

        int[] bestRange = new int[2];

        int longestlength=0;

        Map<Integer, Boolean> numsVisited = new HashMap<>();
        for (int num: arr) {
            numsVisited.put(num, false);
        }

        for (int num : arr) {
            if(numsVisited.get(num)) continue;

            numsVisited.put(num, true);
            int left = num-1;
            int right = num+1;
            int currentLength=1;

            while(numsVisited.containsKey(left)){
                numsVisited.put(left, true);
                currentLength++;
                left--;
            }

            while(numsVisited.containsKey(right)){
                numsVisited.put(right,true);
                currentLength++;
                right++;
            }

            if(longestlength < currentLength){
                longestlength = currentLength;
                bestRange = new int[]{++left, --right} ;
            }
        }
        return bestRange;
    }
}
