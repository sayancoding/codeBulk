class Main{

  static int mazeSolver(int[][] arr,int i,int j){
    int row = arr.length;
    int col = arr[0].length;
    boolean[][] visit = new boolean[row][col];
    int step = mazeUtil(arr, i, j,visit);

    for(int p = 0;p<arr.length;p++){
      for(int q = 0;q<arr[0].length;q++){
        System.out.print(visit[p][q]+" ");
      }
      System.out.println();
    }
    
    return step;
  }
  static int mazeUtil(int[][] arr, int i ,int j,boolean[][] visit){
    if(!isValid(arr, i, j,visit)){
      return 0;
    }

    if(i == arr.length-1 && j == arr[0].length - 1){
      visit[i][j] = true;
      return 0;
    }

    visit[i][j] = true;
    int right = 1 + mazeUtil(arr, i, j+1,visit);
    int down = 1 + mazeUtil(arr, i+1, j,visit);
    visit[i][j] = false;

    return Math.min(right, down);

  }
  static boolean isValid(int[][] arr,int i,int j,boolean[][] visit){
    if(i >= 0 && j >= 0 && i < arr.length && j < arr[0].length && visit[i][j] == false && arr[i][j] == 1 ){
      return true;
    }else{
      return false;
    }
  }
  public static void main(String[] args) {
    int[][] maze = new int[][]{
        { 1, 1, 1, 0 }, 
        { 0, 1, 0, 0 }, 
        { 1, 1, 0, 0 }, 
        { 0, 1, 1, 1 }
    };
    int step = mazeSolver(maze,0,0);
    System.out.println(step);
  }
}