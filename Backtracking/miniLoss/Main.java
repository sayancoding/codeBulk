import java.util.Arrays;
import java.util.HashMap;

class Main {
  static long miniloss(long[] price){
    HashMap<Long,Integer> map = new HashMap<>();
    for(int i = 0 ; i<price.length;i++){
      map.put(price[i], i);
    }
    long min = Integer.MAX_VALUE;
    Arrays.sort(price);
    for(int i = 1; i < price.length ;i++){
      if(map.get(price[i])<map.get(price[i-1])){
        min = Math.min(min, price[i]-price[i-1]);
      }
    }
    return min;
  }
  public static void main(String[] args) {
    long[] price = new long[] {20,7,8,2,5};
    System.out.println(miniloss(price)); 
  }  
}