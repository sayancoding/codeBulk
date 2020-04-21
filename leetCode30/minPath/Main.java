
public class Main {
  static public int minPathSum(int[][] grid)
  {
    int[][] dp = new int[grid.length][grid[0].length];
    dp[0][0] = grid[0][0];
    for(int i=0;i<grid.length;i++)
    {
      for(int j=0;j<grid[0].length;j++)
      {
        if(i==0 && j>0)
          dp[i][j] = grid[i][j] + dp[i][j-1];
        else if(j==0 && i>0)
          dp[i][j] = grid[i][j] + dp[i-1][j];
        else if(i>0&&j>0)
          dp[i][j] = grid[i][j] + Math.min(dp[i][j-1], dp[i-1][j]);
      }
    }
    return dp[(grid.length-1)][(grid[0].length-1)] ;
  }
  public static void main(String[] args) {
    int[][] grid = new int[][] {
      {1,3,1},
      {1,5,1},
      {4,2,1}
    };
    int pathSum = minPathSum(grid);

    System.out.println(pathSum);
  }
}