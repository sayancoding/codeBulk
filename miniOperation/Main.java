import java.util.ArrayList;
import java.util.List;

class Main{
  static int miniOperation(List<Integer> nums,List<Integer> ref){
    int count = 0;
    int[] indexArr = new int[ref.size()];
    for(int i = 0 ; i<ref.size(); i++){
      if(!nums.contains(ref.get(i))){
        count++;
        nums.add(ref.get(i));
        indexArr[i] = nums.size() - 1;
      }
      else
      indexArr[i] = nums.indexOf(ref.get(i));
    }
    for(int i = 0;i<indexArr.length;i++){
      if(indexArr[i] > indexArr[min(indexArr, i)]){
        count++;
        int temp = indexArr[min(indexArr, i)];
        indexArr[min(indexArr, i)] = indexArr[i];
        indexArr[i] = temp;
      }
    }
    return count;
  }
  static int min(int[] arr,int start){
    int minIndex = start;
    for(int i = start+1;i<arr.length;i++){
      if(arr[minIndex] > arr[i]){
        minIndex = i;
      }
    }
    return minIndex;
  }
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    nums.add(3);
    nums.add(1);
    nums.add(2);
    nums.add(5);
    nums.add(4);
    List<Integer> ref = new ArrayList<>();
    ref.add(3);
    ref.add(9);
    ref.add(4);
    ref.add(1);
    ref.add(2);

    System.out.println(miniOperation(nums,ref));
  }
}