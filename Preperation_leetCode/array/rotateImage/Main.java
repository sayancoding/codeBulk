class Main {
  public static void rotatedImage(int[][] matrix) {
    int n = matrix.length;

    for (int i = 0; i < n; i++)
      for (int j = i; j < n; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }


    for(int i=0;i<n;i++){
    int left = 0, right = n-1;
    while(left < right){
    int temp = matrix[i][left];
    matrix[i][left] = matrix[i][right];
    matrix[i][right] = temp;

    left++;
    right--;

    }
    }
  }

  public static void swap() {
  }

  public static void main(String[] args) {
    int[][] matrix = new int[][] { 
      { 1, 2, 3, 4 }, 
      { 5, 6, 7, 1 }, 
      { 0, 1, 2, 3 }, 
      { 7, 2, 5, 3 } 
    };
    rotatedImage(matrix);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}