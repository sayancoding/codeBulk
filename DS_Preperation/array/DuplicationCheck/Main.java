import java.util.HashMap;

class Main {
  static public boolean containsDuplicate(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i : nums){
      if(map.containsKey(i))
      return false;
      else
      map.put(i, 1);
    }
    return false;
  }
public static void main(String[] args) {
  int[] nums = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
  containsDuplicate(nums);
}  
}