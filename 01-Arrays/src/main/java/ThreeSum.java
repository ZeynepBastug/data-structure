import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

}
