/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

*/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for(int i = 0, j = 0; i < n; i++, j += 2){ 
            result[j]=nums[i];
            result[j+1]=nums[n+i];
        }
    return result;
    }
}