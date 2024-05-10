import java.util.Arrays;

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:

// Input: nums = [3,2,3]
// Output: 3

// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

public class MajorityElement {
    public static void main(String[] args) throws Exception {

        int[] array = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        class Solution {
            int[] nums;

            public int majorityElement(int[] nums) {
                // int majorityElement = 0;
                // Arrays.sort(nums);
                // for (Integer num : nums) {
                // int k = 0;
                // for (int i = 0; i<nums.length; i++) {
                // if (nums[i] == num) {
                // k++;
                // }
                // }
                // if (k > nums.length/2) {
                // majorityElement = num;
                // break;
                // }
                // }
                // return majorityElement;

                Arrays.sort(nums);
                int n = nums.length;
                this.nums = nums;
                return nums[n / 2];
            }

            public void printArray() {
                System.out.println(Arrays.toString(nums));
            }
        }

        Solution solution = new Solution();
        System.out.println(solution.majorityElement(array));
        solution.printArray();
    }
}
