import java.util.*;
import java.io.*;

class Main
{
    static String str = "geeks";
    static public void plaindrome(String str)
    {
        HashMap <Character,List<Integer>> query = new HashMap<>();
        query.put('e', Arrays.asList(new Integer[] {3,0 }));
        query.put('s', Arrays.asList(new Integer[] {0,2 }));

        for (Map.Entry el : query.entrySet()) {
            
            System.out.println(arr);
 
        }
    }
    public static void main(String[] args) {
        plaindrome("geeks");
    }
}