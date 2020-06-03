class Main{
  static public String swap(String str, int first, int second){
    char[] charOfString = str.toCharArray();
    char temp = charOfString[first];
    charOfString[first] = charOfString[second];
    charOfString[second] = temp;
    return String.valueOf(charOfString);
  }
  static public void generatedCombination(String str , int start, int end){
    if(start == end ){
      System.out.println(str);
    }else{
      for(int i = start;i<=end;i++){
        String temp = swap(str, start, i);
        generatedCombination(temp, start+1, end);
      }
    }
  } 
  public static void main(String[] args) {
    String str = "ABCD";
    generatedCombination(str, 0, 3);
  }
}