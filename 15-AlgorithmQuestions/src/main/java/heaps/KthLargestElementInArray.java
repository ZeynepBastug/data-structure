package heaps;

/**
 *  Problem: Kth Largest Element in an Array
 *  Given an Integer array nums and an integer k, return the kth largest element in the array.
 *  note that it is the kth largest element in the sorted order, not the kth distict element
 *
 *  Example 1:
 *  input: nums = [3, 2, 1, 5, 6, 4], k = 2
 *  Output: 5
 *
 *  Example 2:
 *  input: nums = [3, 2, 3, 1, 2,4,  5, 5, 6], k = 4
 *  Output: 4
 */

public class KthLargestElementInArray {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = i;
        }

        System.out.println(getKthLargest(nums, 3));
    }

    public static int getKthLargest(int[] array, int k){
        // create a Heap for the array and put numbers into the heap
        
        MyHeap heap = new MyHeap(array.length);
        for (int i = 0; i < array.length ; i++) {
            heap.insert(array[i]);
        }

        for (int i = 0; i < k-1; i++) {
            heap.remove();
        }

        return heap.getRoot();
        
    }




}
