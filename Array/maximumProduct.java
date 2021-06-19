/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
*/

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[n-1]* nums[1]* nums[0]); // numbers can be negative
    }
}
