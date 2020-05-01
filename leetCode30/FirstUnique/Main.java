import java.util.*;

class Main{
  public static void main(String[] args) {
    int nums[] = new int[] { 809};
    FirstUnique obj = new FirstUnique(nums);
    System.out.println(obj.showFirstUnique()); 
    obj.add(809);
    System.out.println(obj.showFirstUnique());
    
  }
}

class FirstUnique {
  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
  Queue<Integer> storeUnique = new LinkedList<Integer>();
  List<Integer> duplication = new ArrayList<>();

  public FirstUnique(int[] nums) {
    for(int i : nums)
    {
      if(!map.containsKey(i))
      map.put(i,1);
      else{
        map.put(i, map.get(i)+1);
      }
    }
    for(int i:nums)
    {
      if(map.get(i)==1)
      storeUnique.add(i);
      else
      duplication.add(i);
    }
  }

  public int showFirstUnique() {
    if(storeUnique.isEmpty()){
      return -1;
    }
    int val =  storeUnique.element();
    return val;
  }

  public void add(int value) {
    if(storeUnique.isEmpty() && duplication.contains(value)==false)
    storeUnique.add(value);

    else if( storeUnique.contains(value)== false && duplication.contains(value)==false)
    storeUnique.add(value);
    else{
      if(storeUnique.contains(value)){
        storeUnique.remove(value);
        duplication.add(value);
      }else{
        if(duplication.contains(value)){

        }else{
          storeUnique.add(value);
        }
      }

    }
  }
}