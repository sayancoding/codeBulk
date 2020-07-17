class Main{
  static void checkExisting(String str){
    String base = "hackerrank";
    int p = 0, q = 0;
    while(p < base.length() && q < str.length()){
      if(base.charAt(p) == str.charAt(q)){
        p++;
      }
      q++;
    }
    if(p == base.length()){
      System.out.println("YES");
      return;
    }
    System.out.println("No");
    return;
  }
  public static void main(String[] args) {
    String str = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
    checkExisting(str);
  }
}