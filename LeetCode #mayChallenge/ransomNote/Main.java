import java.util.HashMap;

public class Main {
  public static boolean canConstruct(String ransomNote, String magazine) {
    HashMap<Character,Integer> map = new HashMap<>();
    for(char el : magazine.toCharArray()){
      if(!map.containsKey(el)){
        map.put(el, 1);
      }else{
        map.put(el, map.get(el)+1);
      }
    }
    for(char ch:ransomNote.toCharArray())
    {
      if(map.containsKey(ch) && map.get(ch)>0){
        map.put(ch, map.get(ch)-1);
      }else{
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    String ransomNote="abb",magazine="aab";
    System.out.println(canConstruct(ransomNote, magazine));
  }
}