// https://leetcode.com/submissions/detail/1257370772/
class Solution {
    public int matrixScore(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int ans = 0;
        
        // flipping all rows with MSB as 0
        // as flipping will ensure largest row sum at the moment
        for(int i=0; i<rows; i++) {
            if(grid[i][0]==0) {
                for(int j=0; j<cols; j++) {
                    grid[i][j]=1-grid[i][j];
                }
            }
        }
        
        for(int j=0; j<cols; j++) {
             int sumCol = 0;
            for(int i=0; i<rows; i++) {
                sumCol += grid[i][j];
                
            }
            // finding if number of 1's are less in that column
            // if yes flip it
            if(sumCol*2<rows) {
                for(int i=0; i<rows; i++) {
                    grid[i][j]=1-grid[i][j];
                }
            }
        }
        
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                ans+=grid[i][j]*(1 << cols-1-j);
            }
        }
        
        return ans;
        
        
        
    }
}
