/*
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
*/
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a=new int[n][n];
        int val=1, k=0, l=0, m=n;
        while(k<m && l<n){ // iterator for row and column
            for(int i=l;i<n;i++) a[k][i]=val++;
            k++;
            for(int i=k;i<m;i++) a[i][n-1]=val++;
            n--;
            if(k<m){
                for(int i=n-1;i>=l;--i) a[m-1][i]=val++;
                m--;
            }
            if(l<n){
                for(int i=m-1;i>=k;--i) a[i][l]=val++;
                l++;
            }
        }
        return a;
    }
}
