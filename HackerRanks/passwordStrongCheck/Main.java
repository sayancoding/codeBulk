import java.util.HashSet;
import java.util.regex.*;
import java.math.*;

class Main{
  static int minimum(String str){
    int count = 0;
    int minus = 0;
    if (str.length() < 6) {
      minus = 6 - str.length();
    }
      Pattern regexSpecial = Pattern.compile("[$&+,:;=?@#|'<>.-^*()%!]");
      Pattern regexNumber = Pattern.compile("[0123456789]");
      Pattern regexLower = Pattern.compile("[abcdefghijklmnopqrstuvwxyz]");
      Pattern regexUpper = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
      if(!regexSpecial.matcher(str).find()){
        count++;
      }
      if(!regexNumber.matcher(str).find()){
        count++;
      }
      if(!regexLower.matcher(str).find()){
        count++;
      }
      if(!regexUpper.matcher(str).find()){
        count++;
      }
      if (count == 0 && minus == 0) {
        return 0;
      }
      return Math.max(count, minus);
  }
  public static void main(String[] args) {
    String str = "#HackerRank";
    System.out.println(minimum("AUzs-nV"));
  }
}