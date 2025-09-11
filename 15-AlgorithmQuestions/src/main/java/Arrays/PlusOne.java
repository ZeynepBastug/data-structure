package Arrays;

import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 *
 * Example 1:
 *
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 */

public class PlusOne {
    public static void main(String[] args) {
        int[] nums= new int[] {9, 9,9,9,9};

        System.out.println(Arrays.toString(plusOne(nums)));


        int[] num = new int[5] ;
        num[0] = 1;
        num[1] = 3;
        num[2] = 5;
        num[3] = 7;
        System.out.println(Arrays.toString(num));

        System.out.println(Arrays.binarySearch(num, 5));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        num = new int[num.length +1];
         num[num.length-1] = 6;

        System.out.println(Arrays.toString(num));
    }


    public static int[] plusOne(int[] digits){

        int n = digits.length;

        for (int i = n-1 ; i >= 0 ; i--) {
            if(digits[i] == 9){
               digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        // All Digits are 9

        digits = new int[n+1];
        digits[0] = 1;

        return  digits;






    }
}
