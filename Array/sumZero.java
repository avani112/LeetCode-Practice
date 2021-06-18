/*
Given an integer n, return any array containing n unique integers such that they add up to 0.
*/

class Solution {
    public int[] sumZero(int n) {
        int[] a=new int[n];
        for(int i=0;i<n/2;i++){
               a[i]=i+1; //positive number
               a[n-i-1]=0-i-1; //negative number
        }
        return a;
    }
}