/*
Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.
*/

class Solution {
    public int thirdMax(int[] nums) {
        SortedSet<Integer>ar=new TreeSet<>();
        for(int i=0;i<nums.length;i++) ar.add(nums[i]);
        if (ar.size() >= 3) {
            ar.remove(Collections.max(ar));
            ar.remove(Collections.max(ar));
        }
        return (Collections.max(ar));
    }
}
