/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
*/

class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
		for(int i=0;i< a.length;i++) {
			for(int j=i+1;j< a.length;j++) {
				if(a[i]==a[j] && Math.abs(i-j)<=k) {
					return true;
				}
			}
		}
        return false;
    }
}
