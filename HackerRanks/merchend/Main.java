import java.util.*;

public class Main {
  public static void merchant(int arr[],int n) {
    List<Integer> list = new ArrayList<>();
    for(int el : arr)
    list.add(el);
    Collections.sort(list);

    int counter = 0, flag = list.get(0),temp=0;
    for(int i = 0;i<list.size();i++)
    {
      if(flag == list.get(i)){
        temp++;
      }else{
        // System.out.println(temp);
        counter += temp/2; 
        flag = list.get(i);
        temp = 1;
      }
      if(i == n-1){
        counter += temp / 2;
        // System.out.println(temp);
      }
    }
    System.out.println(counter);
  }
  public static void main(String[] args) {
    int arr[] = new int[] {10,20,30};
    merchant(arr,3);
  }
}