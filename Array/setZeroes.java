/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.

You must do it in place.
*/
// 2ms solution
class Solution {
  public void setZeroes(int[][] matrix) {
    int R = matrix.length;
    int C = matrix[0].length;
    Set<Integer> rows = new HashSet<Integer>();
    Set<Integer> cols = new HashSet<Integer>();
    for (int i = 0; i < R*C; i++) {
        int r=i/C; int c=i%C;
        if (matrix[r][c] == 0) {
          rows.add(r);
          cols.add(c);
        }
     } 
    for (int i = 0; i < R*C; i++) {
        int r=i/C; int c=i%C;
        if (rows.contains(r) || cols.contains(c)) {
          matrix[r][c] = 0;
        }
     }
  }
}

// 1ms solution

class Solution {
    public void setZeroes(int[][] matrix) {
        int[] r = new int[matrix.length];
        int[] c = new int[matrix[0].length];
        for(int i = 0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length;j++){
                if(matrix[i][j] == 0){
                        r[i] = 1;
                        c[j] = 1;
                }
            }
        }
         for(int i=0;i<r.length;i++){
            if(r[i] == 1){
                for(int k=0;k<matrix[i].length;k++){
                    matrix[i][k] = 0;
                }
            }
        }
        for(int i=0; i< c.length;i++){
            if(c[i] == 1) {
                for (int k = 0; k < matrix.length; k++) {
                    matrix[k][i] = 0;
                }
            }
        }
    }
}
