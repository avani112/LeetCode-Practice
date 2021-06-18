/*

Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

*/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] a) {
        int result [] = new int [a.length];
        for (int i = 0; i<result.length; i++) result[i]=0; //initialise the counts as 0;
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a.length; j++){
                if (a[i]>a[j]){
                    result[i]++; // increse count when condition is true
                }
            }
        }
        return result;
    }
}