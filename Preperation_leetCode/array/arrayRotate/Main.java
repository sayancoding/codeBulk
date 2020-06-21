class Main {
  static public void rotated(int[] nums,int k){
    if(nums.length < k){
      k =  k - nums.length;
    }
      k = nums.length - k;
      
      for (int i = k; i < nums.length; i++) {
        int temp = nums[i];
        int j = i;
        while (j > i - k) {
          nums[j] = nums[j - 1];
          j--;
        }
        nums[i - k] = temp;
      }

    for(int i : nums)
    System.out.print(i+" ");
  }
  public static void main(String[] args) {
    int[] nums = new int[] { 1, 2, 3};
    int k = 4;
    rotated(nums, k);
  }  
}