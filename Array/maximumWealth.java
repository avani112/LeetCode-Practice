/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
*/
class Solution {
    public int maximumWealth(int[][] a) {
        int sum=0; int maxsum=0;
        for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				sum=sum+a[i][j];
                if(sum>maxsum) maxsum=sum;
			}
            sum=0;
		}
        return maxsum;
    }
}