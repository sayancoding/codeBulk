import java.util.HashMap;
import java.util.LinkedList;

class LRUCache{
  LinkedList<Integer> myCache ;
  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
  int capacity;
  
  public LRUCache(int capacity){
    myCache = new LinkedList<Integer>();
    this.capacity = capacity;
  }
  
  public int get(int key) {
    if(myCache.contains(key))
    {
      myCache.remove(myCache.indexOf(key));
      myCache.add(key);
      return map.get(key);
    }
    return -1;
  }

  public void put(int key, int value) {
    if(myCache.size()<this.capacity && (!myCache.contains(key)))
    {
      myCache.add(key);
      map.put(key, value);
    }
    else if(myCache.contains(key)){
      map.put(key, value);
      int idx = myCache.indexOf(key);
        myCache.remove(idx);
        myCache.add(key);
    }
    else {
      myCache.removeFirst();
      myCache.add(key);
      map.put(key, value);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    LRUCache obj = new LRUCache(2);

    // System.out.println(obj.get(2));
    obj.put(2, 6);
    System.out.println(obj.myCache);
    obj.put(1, 5);
    System.out.println(obj.myCache);
    obj.get(2);
    System.out.println(obj.myCache);
    
  }
}
