import java.util.*;

class Main{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for(int i=0;i<15;i++)
        {
            String st = Integer.toString((i+1));
            list.add(st);
        } 
        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);

    }
}