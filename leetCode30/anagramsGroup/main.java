import java.util.*;

class Main{
  public static boolean isAnagrams(String str1,String str2)
  {
    char[] s1 = str1.toCharArray();
    char[] s2 = str2.toCharArray();
    if(s1.equals(s2));
    return true;
  }
  
  public static List<List<String>> groupAnagram(String[] words)
  {
    List<List<String>> result = new ArrayList<>();

    HashMap<String,List<String>> map = new HashMap<String,List<String>>();
    for( String word:words )
    {
	    char currWord[] = word.toCharArray();
      Arrays.sort(currWord);
      String key = new String(currWord);
      map.putIfAbsent(key,new ArrayList<String>());
      map.get(key).add(word);
    }

    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
      result.add(entry.getValue());
    }
    return result;
  }
  public static void main(String[] args) {
    String a = "sayan";
    String word[] = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
    // groupAnagram(word);
    System.out.println(groupAnagram(word));
  }
}