
class Main {
  static public int rangeBitwiseAnd(int m, int n) {
    
    while (m < n)
      n -= (n&-n);

    return n;
  }

  public static void main(String[] args) {
    System.out.println(rangeBitwiseAnd(5,7));
  }
}