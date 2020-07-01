import java.util.HashSet;

class Main {
  public static int removeDuplicate(int nums[]){
    HashSet<Integer> set = new HashSet<>();
    for(int el : nums){
      set.add(el);
    }
    return set.size();
  }
  public static void main(String[] args) {
    int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    System.out.println(removeDuplicate(nums));
  }  
}