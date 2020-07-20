import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Main {
  static public void missingEle(int[] arr,int[] brr){
    List<Integer> list = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int el : brr){
      if(!map.containsKey(el)){
        map.put(el, 1);
      }else{
        map.put(el, map.get(el)+1);
      }
    }
    for(int el : arr){
      if(map.containsKey(el) && map.get(el) > 0){
        map.put(el, map.get(el) - 1);
      }
    }
    map.forEach((k,v)->{
      if(v != 0){
        list.add(k);
      }
    });
    int[] result = new int[list.size()];
    for(int i = 0; i<list.size();i++){
      result[i] = list.get(i);
    }

  }
  public static void main(String[] args) {
    // int[] arr = new int[] { 203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
    int[] arr = new int[] { 11, 4, 11, 7, 13, 4, 12, 11, 10, 14};
    // int[] brr = new int[] {203,204,204,205,206,207,205,208,203,206,205,206,204};
    int[] brr = new int[] { 11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};
    missingEle(arr, brr);
  }  
}