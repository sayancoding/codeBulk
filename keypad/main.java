import java.util.*;

class Main
{
  static public List keypad()
  {
    ArrayList<ArrayList<Character>> key = new ArrayList<ArrayList<Character>>();
    key.add(new ArrayList<Character>(Arrays.asList('a','b','c')));
    key.add(new ArrayList<Character>(Arrays.asList('d','e','f')));
    key.add(new ArrayList<Character>(Arrays.asList('g','h','i')));
    key.add(new ArrayList<Character>(Arrays.asList('j','k','l')));
    key.add(new ArrayList<Character>(Arrays.asList('m','n','o')));
    key.add(new ArrayList<Character>(Arrays.asList('p','q','r','s')));
    key.add(new ArrayList<Character>(Arrays.asList('t','u','v')));
    key.add(new ArrayList<Character>(Arrays.asList('w','x','y','z')));

    int x=4;int y=5;

    for(int i = 0;i<key.get(x).size();i++)
      for(int j = 0;j<key.get(y).size();j++)
      {
        System.out.print(key.get(x).get(i)+""+ key.get(y).get(j)+" ");
      }
    return key;
  }
  public static void main(String[] args) {
    // System.out.println(keypad());
    keypad();
  }
}