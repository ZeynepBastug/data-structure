import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 9, 11};

        System.out.println(Arrays.toString(twoSum1(arr, 9)));
        System.out.println("Optimal Solution.....");
        System.out.println(Arrays.toString(twoSum1Optimal(arr, 9)));
        System.out.println("Two Pointer Solution......");
        System.out.println(Arrays.toString((twoSumTwoPointer(arr, 9))));





    }


    public static int[] twoSum1(int[] array, int target){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if((array[i] + array[j]) == target) return new int[]{i,j};
            }
        }
        return new int[]{};
    }
    // Optimal Solution O(n)
    public static int[] twoSum1Optimal(int[] array, int target){

        //Create HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate over the array.
        // If a potential match exists return that indicies else put the array value and index to map

        for (int i = 0; i < array.length; i++) {
            int potentialMatch = target - array[i];

            if(map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)};
            else map.put (array[i], i);
        }
        return new int[]{};
    }

    // Two Pointer Solution O(nlogN)
    public static int[] twoSumTwoPointer(int[] array, int target){
        // Sort the array. (This has a cost! O(nlogn))
        Arrays.sort(array);

        // Define two index pointers i and j (i from 0 to length. / j from length to 0)
        int i = 0;
        int j = array.length-1;

        while(i < j){
            int sum = array[i] + array[j];
            if ( sum == target) return new int[]{i,j};
            else if ((array[i] + array[j]) < target) i++;
            else j--;
        }
        return new int[]{};
    }




}
