import java.util.*;

class Main{
  static public int[] findIntersect (int[] num1, int[] num2) {
    List<Integer> result = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int el : num1){
      if(!map.containsKey(el)){
        map.put(el, 1);
      }else{
        map.put(el, map.get(el)+1);
      }
    }

    for(int i : num2){
      if(map.containsKey(i) && map.get(i)>0){
        result.add(i);
        map.put(i, (map.get(i)-1));
      }
    }

    int[] resultArr = new int[result.size()];
    int idx = 0;
    for(int el : result){
      resultArr[idx++] = el;
    }
    return resultArr;
  }
  public static void main(String[] args) {
    int num1[] = new int[] {4,9,5};
    int num2[] = new int[] {9,4,9,8,4};
    int result[] = new int[findIntersect(num1, num2).length];
    result = findIntersect(num1, num2);
    for(int i : result)
    System.out.println(i);
  }
}