
class Main {
  static public boolean canJump(int[] nums)
  {
    int lastPos = nums.length - 1;
    for(int i = (nums.length-2);i>=0;i--)
    {
      if(i+nums[i]>=lastPos)
      lastPos = i;
    }
          return lastPos==0;
  }
  public static void main(String[] args) {
    // int nums[] = new int[] {2,0,1,0,4};
    // int nums[] = new int[] {1,2,0};
    // int nums[] = new int[] {2,0,0};
    int nums[] = new int[] {1,0,1,0};
    // int nums[] = new int[] {3,0,8,2,0,1};

    System.out.println(canJump(nums));
  }
}