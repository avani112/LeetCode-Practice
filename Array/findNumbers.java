/*
Given an array nums of integers, return how many of them contain an even number of digits.
*/

class Solution {
    static int digits(int n) { //method for counting digits
		int count=0;
		int n1=n;
		while(n1!=0) {
			n1=n1/10;
			count++;
		}
		return count;
	}
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(digits(nums[i])%2==0) c++;
        }
        return c;
    }
}