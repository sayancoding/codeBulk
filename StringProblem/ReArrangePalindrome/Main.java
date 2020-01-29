import java.util.*;

class Main
{
    static String Str = "geekokgee";
    public static void isReArrangedPalin(String str)
    {
        char[] ch = str.toCharArray();
        HashMap<Character,Integer> listing = new HashMap<Character,Integer>();
        for(char i :ch)
        {
            if(listing.containsKey(i))
                listing.put(i, listing.get(i)+1 );
            else
                listing.put(i, 1);
        }
        for(Map.Entry el:listing.entrySet())
        {
            System.out.println(el.getKey()+"  "+el.getValue());
        }
        
    }
    public static void main(String[] args) {
        
        isReArrangedPalin("geekokgee");
    }
}
