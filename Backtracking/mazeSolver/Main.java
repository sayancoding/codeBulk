class Main{
  static public boolean isValid(int[][] maze,int r,int c){
    return(r>=0 && c >= 0 && r<row && c<col && maze[r][c] == 1);
  }
  
  static public boolean mazeSolver(int[][] maze,int r,int c){
    if(r == row-1 && c == col-1 && maze[r][c] == 1 ){
      return true;
    }
    if(isValid(maze, r, c)){
      
      if(mazeSolver(maze, r, c+1))
      return true; //right
      if(mazeSolver(maze, r+1, c))
      return true; //down
      // if(mazeSolver(maze, r, c-1))
      // return true; //left
      // if(mazeSolver(maze, r-1, c+1))
      // return true; //up

      return false;
    }
    return false;
  }
  static int row = 4,col = 4;
  public static void main(String[] args) {
    int [][] maze = new int[][] {
      {1,1,1,0},
      {0,1,0,0},
      {1,1,0,0},
      {0,1,1,1},
    };
    row = maze.length;
    col = maze[0].length;
    try {
      
      System.out.println(mazeSolver(maze, 0, 0));
    } catch (Exception e) {
    }
  }
}