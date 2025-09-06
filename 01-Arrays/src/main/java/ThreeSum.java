import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int[] array1 = new int[] {12, 3, 1, 2, -6, 5, -8, 6};

        System.out.println("Printing solution with two pointers.......");

    }

    //O(n^2) time | O(n) space
    // this is a two pointer solution, for every i,
    // running two pointer solution as in the two sum problem
    public static List<List<Integer>> threeNumberSum1(int[] array, int targetSum){
        // Overall Complexity nlogn + n x n = n^2

        Arrays.sort(array);
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < array.length-2; i++) {

            // Reset left and right pointer
            int left = i+1;
            int right = array.length-1;

            while (left < right){
                int currentSum = array[i] +array[left] + array[right];

                if(currentSum == targetSum){
                    triplets.add(Arrays.asList(array[i], array[left], array[right]));
                    left++;
                    right--;
                }else if( currentSum < targetSum){
                    left ++;
                }else if (currentSum > targetSum){
                    right--;
                }
            }
        }
        return triplets;

    }

    // HashMap solution for 3 Sum problem
    // Overall complexity is: nlogn + n + O(n^2)
    public static List<List<Integer>> threeNumSumHashMap (int[] array, int target){

        Set<List<Integer>> result = new HashSet<>();
        HashMap <Integer, Integer> map = new HashMap<>();

        Arrays.sort(array); // O(nlogn)

        // Put all numbers in  a HashMap to create a look up pointer
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);   //O(n)
        }

        // in a nested loop try to find a match for each pair
        // from hashmap that ads up to target
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1 ; j < array.length ; j++) {
                List<Integer> triplets = new ArrayList<>();
                int potentialMatcher = target - array[i] - array[j];

                if(map.containsKey(potentialMatcher) && map.get(potentialMatcher) > j){
                    triplets.add(array[i]);
                    triplets.add(array[j]);
                    triplets.add(potentialMatcher);
                    result.add(triplets);
                }}}
        return new ArrayList<>(result);
    }
}
