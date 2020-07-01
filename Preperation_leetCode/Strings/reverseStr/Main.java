class Main{
  static public void reverseString(char[] s){
    int first = 0, last = s.length-1;

    while(first<last){
      swap(s, first, last);
      first++;
      last--;
    }
  }
  static public void swap(char[] s,int first,int last){
    char temp = s[first];
    s[first] = s[last];
    s[last] = temp;
  }
  public static void main(String[] args) {
    char[] s = new char[] { 'h', 'e', 'l', 'l', 'o'};
    reverseString(s);
    for(char ch : s)
    System.out.print(ch+" ");
  }
}