/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int[] sub = new int[nums.length];
        if(nums.length==1) return nums[0];
        int sumarray=0;
        int maxsum=-10;
        for(int i=0;i<nums.length;i++){
                sumarray = sumarray+nums[i];
                maxsum=Math.max(maxsum,sumarray);
            if(sumarray<0) sumarray=0;
        }
        return maxsum;
    }
}
