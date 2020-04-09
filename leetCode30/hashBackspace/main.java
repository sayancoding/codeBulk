import java.util.Stack;

class Main{
  public static String backspaceRemoved(String str) {
    char[] charToStr = str.toCharArray();
    Stack<Character> letterStack = new Stack<Character>();

    for(char s: charToStr)
    {
      if(s != '#')
      {
        letterStack.push(s);
      }else{
        if(!letterStack.isEmpty()){
          letterStack.pop();
        }
      }
    }
    return String.valueOf(letterStack);
  }
  public static void main(String[] args) {
   String s = "ab#c";  
   backspaceRemoved(s);
  }
}