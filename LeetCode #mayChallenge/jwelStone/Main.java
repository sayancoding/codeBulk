import java.util.*;

class Main{
   static public int numJewelsInStones(String J, String S) {
    HashMap<Character,Integer> jMap = new HashMap<Character,Integer>();
    HashMap<Character,Integer> sMap = new HashMap<Character,Integer>(); 
    char[] j = J.toCharArray();
    char[] s = S.toCharArray();
    for(char x:j){
      if(!jMap.containsKey(x))
      jMap.put(x, 1);
      else
      jMap.put(x, jMap.get(x)+1);
    }
    for(char x:s){
      if(jMap.containsKey(x)){
        if(!sMap.containsKey(x))
        sMap.put(x, 1);
        else
        sMap.put(x, sMap.get(x)+1);
      }
    }
    int cost = 0;
    for(Map.Entry<Character, Integer>entry :sMap.entrySet())
    {
      cost += entry.getValue();
    } 
    return cost;
  }
  public static void main(String[] args) {
    String J = "aA", S = "AaaaAb";
    int val = numJewelsInStones(J, S);
    System.out.println(val);
  }
}