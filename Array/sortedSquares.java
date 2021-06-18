/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        while(i<nums.length){
            nums[i]=nums[i]*nums[i];
            i++;
        }
        Arrays.sort(nums);
        return nums;
    }
}