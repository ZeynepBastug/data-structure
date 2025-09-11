package Arrays;

import java.util.Arrays;




public class MergeSortedArray {

    public static void main(String[] args) {
        int[] arr1 = new int[6] ;
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        int[] arr2 = new int[] {2,5,6};

        int m= 6;
        int n = 3;

        merge(arr1,m, arr2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        if(m == 0 && n > m){
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }

        }else{
            int numTotal = m - n;

            for (int num : nums2) {
                nums1[numTotal] = num;
                numTotal++;
            }
            Arrays.sort(nums1);

            System.out.println(Arrays.toString(nums1));

        }

    }
}
