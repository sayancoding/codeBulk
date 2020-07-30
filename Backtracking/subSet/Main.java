import java.util.*;
class Main {
  static void possibleSet(int[] arr,int idx,int target ,int n,List<Integer> result){
    if(idx >= n){
      return ;
    }
    result.add(arr[idx]);
    if(sum(result) == target){
      System.out.println(result);
    }
    possibleSet(arr, idx+1,target, n, result);
    result.remove(result.size()-1);
    possibleSet(arr, idx+1,target, n, result);
  }
  static int sum(List<Integer>list){
    int sum = 0;
    for(int i = 0 ;i < list.size();i++){
      sum += list.get(i);
    }
    return sum;
  }
  public static void main(String[] args) {
    int[] arr = new int[] {1,2,3,4,8};
    List<Integer> result = new ArrayList<Integer>();
    possibleSet(arr, 0,10, arr.length,result);
  }  
}