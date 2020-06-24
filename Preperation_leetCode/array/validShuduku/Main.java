import java.util.HashSet;

class Main {
  static public boolean isValidSudoku(String[][] matrix){
    HashSet<String> set = new HashSet<>();
    for(int i = 0; i<9 ; i++){
      for(int j = 0; j<9 ; j++){
        if(matrix[i][j] != "."){
          String row = matrix[i][j] +" have at "+ " row "+i;
          String col = matrix[i][j] +" have at "+ " col "+j;
          String box = matrix[i][j] +" have at box "+ (i/3)+" "+(j/3);

          if(set.contains(row) || set.contains(col) || set.contains(box))
          return false;
          else{
            set.add(row);
            set.add(col);
            set.add(box);
          }
        }
      }
    }
    return true;
  }
  public static void main(String[] args) {
    String[][] matrix = new String[][]{
      {"5","3",".",".","7",".",".",".","."},
      {"6",".",".","1","9","5",".",".","."},
      {".","9","8",".",".",".",".","6","."},
      {"8",".",".",".","6",".",".",".","3"},
      {"4",".",".","8",".","3",".",".","1"},
      {"7",".",".",".","2",".",".",".","6"},
      {".","6",".",".",".",".","2","8","."},
      {".",".",".","4","1","9",".",".","5"},
      {".",".",".",".","8",".",".","7","9"}
    };
    System.out.println(isValidSudoku(matrix)); 
  }  
}