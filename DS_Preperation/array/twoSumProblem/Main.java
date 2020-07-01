import java.util.ArrayList;
import java.util.List;

class Main {
  public static int[] twoSum(int[] nums, int target) {
    List<Integer> list = new ArrayList<>();
    for(int i : nums)
    list.add(i);
    int[] result = new int[2];
    for(int i = 0; i<nums.length ; i++){
      int diff = target - list.get(i);
      if(list.contains(diff) && list.indexOf(diff) != i){
        result[0] = i;
        result[1] = list.indexOf(diff);
        for(int k : result)
        System.out.println(k);
        return result;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int[] nums = new int[] { 3,2,4};
    int target = 6;
    twoSum(nums, target);
  }  
}