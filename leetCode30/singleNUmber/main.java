import java.util.*;

class Main{
  static public void findSingle(int number[])
  {
    HashMap<Integer,Integer> num = new HashMap<Integer,Integer>();
    for(int n : number){
      if(num.containsKey(n) == false)
      {
        num.put(n, 1);
      }else{
        int v = num.get(n);
        num.put(n, ++v);
      }
    }
    for(int temp:num.keySet())
    {
      if(num.get(temp)==1)
      {
        System.out.println(temp);
      }
    }
  }
  /*Different solution least complexity*/ 
  // static public void findSingle(int number[])
  // {
  // if(nums==null||nums.length==0)return 0;

  // int n = nums.length;
  // int ans = 0;for(
  // int i = 0;i<n;i++)
  // {
  //   ans ^= nums[i];
  // }

  // return ans;
  // }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int [] getNumber = 
    int[] number = new int[] {1,2,3,3,4,2,1,2};
    findSingle(number);
  }
}