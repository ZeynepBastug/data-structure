package Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if( strs == null || strs.length== 0) return "";

        int minLength = 200;

        // Finding the string with the min amount of chars.
        for (String string : strs) {
            if(string.length()< minLength){
                minLength = string.length();
            }
        }

        // Preparation for binary search
        int low = 1;
        int high = minLength;

       while(low <= high) {

            int middle = (low+high) / 2;

            if (matcher(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle -1;
            }
        }

        return strs[0].substring(0, (low + high) /2);
    }


    public static boolean matcher(String[] strs, int length){

        String prefix = strs[0].substring(0, length+1);

        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            if(!str.startsWith(prefix)){
                return false;
            }
        }

        return true;
    }
}
