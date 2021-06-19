/* Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums. */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>(); 
        Set<Integer> num = new HashSet<>(); // hashset cannot contain duplicate so duplicate elements will be eliminated 
        for(int i:nums) num.add(i); // adding elements 1 to nums.length in num
        for(int i=1;i<=nums.length;i++){
            if(!num.contains(i)) result.add(i);
        }
        return result;
    }
}

