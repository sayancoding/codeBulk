import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class WordBreak
{
    public static boolean isWordBreak(String s, Set<String> dict) {
        Set<String>list = dict;
        List<String>findWord = new ArrayList<String>(); 
        if(s.length() == 0) return true;
        for(int i = 1;i<=s.length();i++)
        {
            if(dict.contains(s.substring(0, i))&&isWordBreak(s.substring(i, s.length()), list))
            {
                findWord.add(s.substring(0, i));  
                return true;
            }
        }
        showWord(findWord);
      return false;  
    }
    public static void showWord(List<String>ls) {
        System.out.println(ls);
    }
    public static void main(String[] args) {
        String[] dictArr = new String [] {"c","od","e","x"};
        Set<String> dict = new HashSet<String>();
        for(String s:dictArr)
            dict.add(s);

        boolean result =  isWordBreak("code", dict);
        System.out.println(result);
    }
}