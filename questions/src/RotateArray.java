import java.util.Arrays;

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:

// Input: nums = [3,2,3]
// Output: 3

// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

public class RotateArray {

    public static void reverse(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void reverse_partial(int arr[], int ini, int end) {
        int temp;
        while (ini < end) {
            temp = arr[ini];
            arr[ini++] = arr[end];
            arr[end] = temp;
            end--;
        }
    }

    public static void main(String[] args) throws Exception {

        int[] array = { 1, 2 };
        class Solution {
            int[] nums;

            public void rotate(int[] nums, int k) {
                // int[] arr1 = new int[nums.length-k];
                // int[] arr2 = new int[k];
                // for (int i = 0; i<nums.length-k; i++) {
                // arr1[i] = nums[i];
                // }
                // for (int i = nums.length-k, j = 0; i<nums.length; i++) {
                // arr2[j++] = nums[i];
                // }
                // for (int i = 0, j = 0; i<nums.length; i++) {
                // if(i<k) {
                // nums[i] = arr2[i];
                // } else {
                // nums[i] = arr1[j++];
                // }
                // }

                k = k % nums.length;
                if (k < 0) {
                    k += nums.length;
                }
                reverse(nums);
                reverse_partial(nums, 0, k - 1);
                reverse_partial(nums, k, nums.length - 1);
                this.nums = nums;

            }

            public void printArray() {
                System.out.println(Arrays.toString(nums));
            }
        }

        Solution solution = new Solution();
        solution.rotate(array, 3);
        solution.printArray();
    }
}
