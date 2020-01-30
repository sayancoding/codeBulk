import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class AutoComplete
{
    class Node 
    {
        String prefix;
        HashMap <Character,Node> children;
        boolean isWord = false;
        
        private Node(String prefix)
        {
            this.prefix = prefix;
            this.children = new HashMap<Character,Node>();
        }
    }
    public Node trie;
    AutoComplete(String[] dist)
    {
        trie = new Node("");
        for(String s : dist)
            insertWord(s);
    }
    void insertWord(String s)
    {
        Node curr = trie; 
        for(int i=0;i<s.length();i++)
        {
            if(!curr.children.containsKey(s.charAt(i)))
            {
                curr.children.put(s.charAt(i), new Node(s.substring(0, i+1)));
            }
            curr = curr.children.get(s.charAt(i));
            if(i== s.length()-1)
            {
                curr.isWord = true;
            }
        }
    }

    public List<String> getWord(String pref)
    {
        List<String> result = new LinkedList<String>();
        Node curr = trie;
        for(Character c: pref.toCharArray())
        {
            if(curr.children.containsKey(c))
                curr = curr.children.get(c);
            else
                return result;    
        }

        findAllWords(curr,result);
        return result;
    }

    public void findAllWords(Node n,List<String>result)
    {
        if(n.isWord) result.add(n.prefix);
        for(Character c : n.children.keySet())
            findAllWords(n.children.get(c), result);
    }
    public static void main(String[] args) {
        String prefixGiven = "abc";
        //That's dictionary word given here
        String[] dist = new String[] { "abc", "acb", "bcd", "bca","abd","acc","a","b"};
        AutoComplete obj = new AutoComplete(dist); 
        System.out.println(obj.getWord("ab")); // prefix "ab"
        System.out.println(obj.getWord("ac")); // prefix "ac"
        System.out.println(obj.getWord("bc")); // prefix "bc"
        System.out.println(obj.getWord("a"));  // prefix "a"
        System.out.println(obj.getWord("b"));  // prefix "b"
    }
}
