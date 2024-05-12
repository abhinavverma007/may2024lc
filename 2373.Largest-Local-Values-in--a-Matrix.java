// https://leetcode.com/submissions/detail/1256470253/

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] ans = new int[row-2][row-2];
        
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i+2<row; i++) {
            for(int j=0; j+2<col; j++) {
                ans[i][j]=calcSum(grid,i,j,row,col);   
            }
            
        }
        
        return ans;
        
    }
    
    public static int calcSum(int[][] grid, int startI, int startJ,int row,int col) {
        int maxVal = Integer.MIN_VALUE;
        for(int i=startI; i<=startI+2; i++) {
            for(int j=startJ; j<=startJ+2; j++) {
                maxVal = Math.max(maxVal,grid[i][j]);
            }
        }
        
        return maxVal;
    }
}
