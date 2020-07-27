import java.util.ArrayList;

class Main{
  static int sum(ArrayList<Integer> list){
    int sum = 0;
    for(int el : list)
      sum += el;
    return sum;
  }
  static void subSetSum(int[] arr,int sum,int i, ArrayList<Integer> result){
    if(i >= arr.length){
      return ;
    }
    if(sum(result) == sum){
      System.out.println(result);
      return;
    }
    result.add(arr[i]);
    subSetSum(arr, sum, i+1,result);
    result.remove(result.size()-1);
    subSetSum(arr, sum, i + 1, result);
  }
  public static void main(String[] args) {
    int[] arr = new int[] {2,1,2,3,4,8};
    int sum = 10;
    ArrayList<Integer> result = new ArrayList<>();
    subSetSum(arr,sum,0,result);
  }
}