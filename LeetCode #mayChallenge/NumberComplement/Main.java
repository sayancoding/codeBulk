public class Main {
  public static int findComplement(int num) {
    int result = 0;
    int power = 1;
    while(num>0){
      result += (num%2 ^1)*power;
      power <<= 1;
      num >>= 1;
    }
    return result;
  }
  public static void main(String[] args) {
    int number  = 5;
    System.out.println(findComplement(number));
  }
}