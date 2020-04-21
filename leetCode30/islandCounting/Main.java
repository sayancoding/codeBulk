class Main
{
  public static void main(String[] args) {
    int[][] grid = new int[][] {
      {1,1,0,0,0},
      {1,1,0,0,0},
      {0,0,1,0,0},
      {0,0,0,1,1}
    }; 

    int count = numOfIsland(grid);
    System.out.println(count);
  }

  static public int numOfIsland(int[][] grid)
  {
    int count = 0;
    int maxRow = grid.length;
    int maxColumn = grid[0].length;

    for(int r = 0 ;r<maxRow;r++)
    {
      for(int c =0;c<maxColumn;c++)
      {
        if(grid[r][c] == 1)
        count += 1;

        markIsland(grid,r,c,maxRow,maxColumn);
      }
    }
    return count;
  }
  static public void markIsland(int[][] grid,int r,int c,int maxRow,int maxColumn)
  {
    if (r < 0 || r >= maxRow|| c < 0 || c >= maxColumn || grid[r][c] != 1) 
      return;
    
    grid[r][c] = 2;
    markIsland(grid, r+1, c, maxRow, maxColumn);
    markIsland(grid, r-1, c, maxRow, maxColumn);
    markIsland(grid, r, c+1, maxRow, maxColumn);
    markIsland(grid, r, c-1, maxRow, maxColumn);
  }
}