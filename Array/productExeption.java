/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodr=1, prodl=1, l=nums.length;
        int[] rar = new int[l]; //left array
        int[] lar = new int[l]; // right array
        int[] answer = new int[l];
        for(int i=0;i<l;i++){
            lar[i]=prodl; // product of left array
            prodl*=nums[i];
            rar[l-i-1]=prodr; // product of right array
            prodr*=nums[l-1-i];
        }
        for(int i=0;i<l;i++) answer[i]=rar[i]*lar[i]; product of left array and right array
        return answer;
    }
}