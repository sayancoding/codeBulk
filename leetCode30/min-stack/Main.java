import java.util.Stack;

class MinStack{
  Stack<Integer> stack;
  Stack<Integer> minStack;

  MinStack() {
      stack = new Stack<>();
      minStack = new Stack<>();
    }

  public void push(int x) {
    if(minStack.isEmpty())
    {
      minStack.push(x);
      stack.push(x);
      // System.out.println(minStack.peek());
    }
    else
    {
      minStack.push((stack.peek()>x)?x:stack.peek());
      stack.push(x);
      // System.out.println(minStack.peek());
    }
  }

  public void pop() {
    stack.pop();
    minStack.pop();
  }

  public int top() {
    int top = stack.peek();
    return top;
  }

  public int getMin() {
    int minOfStack = minStack.peek();
    return minOfStack;
  }
}

public class Main {
  public static void main(String[] args) {
    MinStack obj = new MinStack();
    obj.push(-2);
    obj.push(0);
    obj.push(-1);
    System.out.println(obj.getMin());
    System.out.println(obj.top());
    System.out.println("-----");
    obj.pop();
    // System.out.println(obj.top());
    System.out.println(obj.getMin());
  }
}