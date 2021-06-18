/*
We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.
*/

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){// for frequency
           for(int j=1;j<=nums[i];j++) res.add(nums[i+1]);// adding values to list for nums[i] number of times 
        }
        int[] ret = new int[res.size()]; 
        for(int i=0;i<res.size();i++) ret[i]=res.get(i);
        return ret;
    }
}