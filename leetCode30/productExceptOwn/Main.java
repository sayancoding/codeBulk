import java.util.Stack;

class Main {
  static public boolean checkValidString(String s) {
    boolean isValid = false ;
    Stack<Character> st = new Stack<>();
    Stack<Character> st2 = new Stack<>();

    for(int i =0;i<s.length();i++)
    {
      if(s.charAt(0)==')')
      return false;

      if(s.charAt(i) == '(')
      st.push(s.charAt(i));

      else if(s.charAt(i)=='*')
      st2.push(s.charAt(i));
      
      if(st.isEmpty() && s.charAt(i) == ')')
      {
        isValid = false; 
      }

      else if(!st.isEmpty() && s.charAt(i) == ')')
      {
        st.pop();
      }
      // else if(!st2.isEmpty()){
        
      // }
      if(st.isEmpty() &&  s.charAt(i) == ')'){
        if(!st2.isEmpty())
        st2.pop();
      }
      System.out.println(st);
      System.out.println(st2);
      System.out.println();
    } 

    if(st.isEmpty() || (st.size() == st2.size()))
    isValid = true;
    else{
      isValid = false;
    }

    return isValid;
  }
  public static void main(String[] args) {
    // String str = "(*()";
    String str = "(())(())(((()*()()()))()((()()(*()())))(((*)()";
    System.out.println(checkValidString(str));
  }
}

// "(())(())(((()*()()()))()((()()(*()())))(((*)()"