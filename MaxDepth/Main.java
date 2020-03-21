class Main{
  public static void main(String[] args) {
    String str = "(((x))(((y))))";
    int maxCount = 0,currCount =0;
    for(int i =0;i<str.length();i++)
    {
      if(str.charAt(i)=='(')
      {
        currCount++;
        if(currCount>maxCount)
        maxCount = currCount;
      }
      if(str.charAt(i)==')')
      currCount--;
    }
    System.out.println(maxCount);
  }
}