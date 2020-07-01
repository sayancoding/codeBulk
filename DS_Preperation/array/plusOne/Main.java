class Main {
  public static int[] plusOne(int[] digits){
    int carry = 0;
    for(int i = digits.length -1;i>=0;i--){
      if(digits[i]<9 && i == digits.length - 1){
        digits[i]++;
        return digits;
      }
      if(digits[i]<9){
        digits[i] = digits[i]+carry;
        carry = 0;
        return digits;
      }
      if(digits[i]==9 && i !=0){
        digits[i] = 0;
        carry = 1;
      }
      if(digits[i] == 9 && i == 0){
        int[] newArr = new int[digits.length+1];
        for(int k = 0; k<newArr.length; k++)
        newArr[k] = 0;

        newArr[0] = 1;
        return newArr;
      }
    }
    return digits;
  }
  public static void print(int[] digits) {
    for(int i = 0 ; i<digits.length;i++)
    System.out.println(digits[i]+" ");
  }
  public static void main(String[] args) {
    int[] nums = new int[] { 9,9,9};
    print(plusOne(nums));
  }  
}