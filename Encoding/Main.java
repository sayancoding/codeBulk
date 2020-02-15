class Main
{
  static public void encode(String str)
  {
    StringBuilder encodedStr = new StringBuilder();
    int n = str.length();
    char prev = str.charAt(0);
    int count = 1;

    for(int i=1;i<n;i++)
    {
      if(prev != str.charAt(i))
      {
        encodedStr.append(count);
        encodedStr.append(prev);
        count = 1;
        prev = str.charAt(i);
      }
      else
      {
        ++count;
        prev = str.charAt(i);
      }
      //last sub-sequence matched      
      if(i == (n-1))
      {
        encodedStr.append(count);
        encodedStr.append(prev);
      }
    }
    
    System.out.println(encodedStr);
  }
  public static void main(String[] args) {
    String st = "AAAABBC";
    encode(st);
  }
}