import java.util.HashMap;

class Main{
  public static int majorityElement(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    if(nums.length == 0){
      return -1;
    }
    for(int el : nums){
      if(!map.containsKey(el)){
        map.put(el, 1);
      }else{
        map.put(el, map.get(el)+1);
      }
      if(map.get(el)>(nums.length/2)){
        return el;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] nums = new int[] {2,2,1,1,1,2,2};
    System.out.println(majorityElement(nums));
  }
}