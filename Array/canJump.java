/*
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.
*/

class Solution {
      public boolean canJump(int[] nums) {
           int n = nums.length;
           int last = n-1;
           int i=n-2;
           while( i>=0){
               if( last <= nums[i] + i ){ //nums[i] + i array element added to its index can reach the last element,
                    last = i;   // if so, last become i
               }
               i--; // decrement till 0
           }
           
           return last==0;
       }
}
