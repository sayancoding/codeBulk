import java.util.*;
import java.lang.Math;

class Main{
  static int sortedSum(int[] arr){
    List<Integer> a = new ArrayList<>();
    List<Long> result = new ArrayList<>();

    for(int el : arr){
      a.add(el);
    }

    for(int i = 0;i<a.size();i++){
      List<Integer> temp = new ArrayList<>();
      for(int j = 0;j<=i;j++){
        temp.add(a.get(j));
      }
      Collections.sort(temp);
      long sum = 0;
      for(int k = 1 ; k<=temp.size();k++){
        sum = sum + k*temp.get(k-1);
      }
      result.add(sum);
    }
    long sum = 0;
    for(long el : result){
      sum += el;
    }
    // System.out.println(sum);
    int cal = (int)(sum % (Math.pow(10, 9) + 7));
    return cal;
  }
  public static void main(String[] args) {
    int[] arr = new int[] {9,5,8};
    System.out.println(sortedSum(arr));
  }
}