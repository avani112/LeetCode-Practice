/* Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.

Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

The tests are generated such that there is exactly one solution. You may not use the same element twice. */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result= new int[2];
        int i=0, j=nums.length-1;
         while(i<j){
            int sum = nums[i] + nums[j];
            if(sum < target){
                i++;
            }else if(sum > target){
                j--;
            }else{
                result[0]=i+1;
                result[1]=j+1;
                return result;
            }
        } 
        return result;
    }
}
