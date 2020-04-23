import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Main {
  public static int search(int[] nums, int target) {
    int idx;
    List<Integer> myList = new ArrayList<>();
    for(int el : nums)
    myList.add(el);
    if(myList.contains(target))
    {
      idx = myList.indexOf(target);
      return idx;
    }
    else
    {
      return -1;
    }
  }
  public static void main(String[] args) {
    int [] nums = new int[] { 4, 5, 6, 7, 0, 1, 2};
    System.out.println(search(nums, 2));
  }
}