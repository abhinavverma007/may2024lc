// https://leetcode.com/submissions/detail/1258291305/
class Solution {
  public int getMaximumGold(int[][] grid) {
    int row = grid.length;
    int col = grid[0].length;
    boolean[][] visited = new boolean[row][col];
    int maxValue = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        visited = new boolean[row][col];
        if (grid[i][j] != 0) {
          int goldCollected = helper(grid, i, j, visited);
          maxValue = Math.max(maxValue, goldCollected);
        }

      }
    }

    return maxValue;

  }

  public static int helper(int[][] grid, int i, int j, boolean[][] visited) {

    // out of boundary check
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
      return 0;
    }
    // not visited 0 cell
    if (grid[i][j] == 0) {
      return 0;
    }

    // not visited already visited
    if (visited[i][j]) {
      return 0;
    }

    visited[i][j] = true;

    int ans = Integer.MIN_VALUE;

    ans = Math.max(ans, helper(grid, i + 1, j, visited));

    ans = Math.max(ans, helper(grid, i - 1, j, visited));

    ans = Math.max(ans, helper(grid, i, j + 1, visited));

    ans = Math.max(ans, helper(grid, i, j - 1, visited));

    visited[i][j] = false;

    return ans + grid[i][j];
  }
}
