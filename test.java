import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// class Test
// {

//     public static void main(String[] args) {
//         int[] listing = new int[] {0,1,0,0,1,0,1,1};
//         int prevPtr= 0,endPtr = (listing.length - 1);
//         int sortedArr[] = new int[listing.length];
    
//         for(int i = 0;i<listing.length;i++)
//         {
//             if(listing[i]==0)
//                 sortedArr[prevPtr++] = listing[i];
//             else
//                 sortedArr[endPtr--] = listing[i];
//         }
//         for(int i = 0;i<listing.length;i++)
//             System.out.print(sortedArr[i]+" ");    
//     }
// }

class Test{
    public static HashMap<Character, Integer> countChar(String str) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            else
                map.put(str.charAt(i),1);
        }
        return map;
    }

    public static HashMap<Character, Integer> get(List<String> wordList, HashMap<Character, Integer> data) {
        StringBuilder str = new StringBuilder();
        HashMap<Character, Integer> mulValue = new HashMap<Character, Integer> ();
        for (int i = 0; i < wordList.size(); i++) {
            str.append(wordList.get(i));
        }   
        String genStr = str.toString();
        HashMap<Character, Integer> count = countChar(genStr);
            for (Map.Entry<Character, Integer> entryCount : count.entrySet())
            {
                Character key = entryCount.getKey();
                Integer value1 = entryCount.getValue();
                Integer value2 = data.get(key);
                mulValue.put(key, (value1*value2));
            }
            return mulValue;
    }

    public static char find(HashMap<Character, Integer> dataFinal,int findVal) {
        HashMap<Character, Integer> dataWork = dataFinal;
        char ch = '\0';
        for (Map.Entry<Character, Integer> entryData : dataWork.entrySet())
        {
           if(findVal == entryData.getValue())
           {
               ch = entryData.getKey();
               break;
           }
        }
        System.out.println(dataWork);
        return ch;
    }

    public static HashMap<Character,Integer> takeData() {
        HashMap<Character,Integer> data = new HashMap<Character,Integer>();
        data.put('s', 10);
        data.put('a', 20);
        data.put('y', 30);
        data.put('u', 40);
        data.put('n', 50);
        return data;
    }
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<String>();
        wordList.add("sayan");
        wordList.add("saays");
        wordList.add("sun");
        HashMap<Character,Integer> data = takeData(); 
        HashMap<Character,Integer> dataFinal = get(wordList,data);
        char ch = find(dataFinal,60);
        System.out.println(ch);
    }
}

