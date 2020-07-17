// import java.util.*;

// class Main {
//   public static void main(String[] args) {
//     String s = "aaabccddd";
//     HashMap<Character,Integer> map = new HashMap<>();
//     for(char ch : s.toCharArray()){
//       if(!map.containsKey(ch)){
//         map.put(ch,1);
//       }else{
//         map.put(ch, map.get(ch)+1);
//       }
//     }
//     List<Character> result = new ArrayList<>();
//     map.forEach((k,v)->{
//       if(v%2 !=0){
//         result.add(k);
//       }
//     });
//     String output = "";
//     for(char ch : result){
//       output = output+ch;
//     }
//     System.out.println(output);
//   }  
// }

class Main{
  public static void main(String[] args) {
    String s = "aaabccddd";
    int index = 0;
    String result = "";
    while(index < s.length()){
      if(index == s.length()-1){
        
        result = result+s.charAt(index);
        return;
      }
      if(s.charAt(index) == s.charAt(index+1)){
        index += 2;
      }else{
        result = result+s.charAt(index);
        index++;
      }
    }
    System.out.println("a");
  }
}