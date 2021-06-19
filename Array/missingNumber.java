/* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity? */

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int x = (n * (n + 1))/2; // sum of all numbers in range 0 to n (arithmetic progression)
        int r = 0; // sum of all elements in array
        for(int i = 0; i < n; i++){
           r += nums[i];
        }
        return x - r;
    }
}
