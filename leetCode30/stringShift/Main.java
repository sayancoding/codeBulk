
class Main {
  static public String stringShift(String s, int[][] shift) {
    int finalShifting = 0;
    for(int[] el : shift)
    {
      if(el[0]==0)
      finalShifting -= el[1];
      else
      finalShifting += el[1];
    }
    
    finalShifting %= s.length();

    if(finalShifting>0)
    return(s.substring(s.length()-finalShifting, s.length())+s.substring(0, 
        s.length() - finalShifting));
    else if(finalShifting<0)
    {
      finalShifting *= -1;
      return(s.substring(finalShifting , s.length())+s.substring(0, finalShifting));
    }
    else
    return s;
  }
  public static void main(String[] args) {
    // int[][] shift = new int[][] {{0,1},{1,2}};
    // System.out.println(stringShift("abc", shift));
    int[][] shift = new int[][] {{0,7},{1,7},{1,0},{1,3},{0,3},{0,6},{1,2}};
    System.out.println(stringShift("wpdhhcj", shift));
  }
}

