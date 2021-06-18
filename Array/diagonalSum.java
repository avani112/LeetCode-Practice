/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
*/
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j) sum=sum+mat[i][j]; //primary diagonal
                if(i+j==mat.length-1 && i!=j) sum=sum+mat[i][j]; //secondary diagonal excluding common element
            }
        }
        return sum;
    }
}