import java.util.*;

class Main
{
  public static List<Integer> produceUnique(int[] arr) {
    List<Integer> numbers = new ArrayList<>();
    List<Integer> unique = new ArrayList<>();
    for (int i : arr)
      numbers.add(i);
    Collections.sort(numbers);
    unique = numbers;
    // for (int i = 0; i < numbers.size(); i++) {
    //   if (!(unique.contains(numbers.get(i)))) {
    //     unique.add(numbers.get(i));
    //   }
    // }
    return unique;
  }
  
  public static int countElements(int[] arr) {
    List<Integer> unique = produceUnique(arr);
    int counter = 0;
    for(int i:unique)
    {
      if(unique.contains(i+1))
      {
        ++counter;
      }
    }
    
    return counter;
  }
  public static void main(String[] args) {
    int numbers[] = new int[] { 1,1,2,2};
    System.out.println(countElements(numbers));
  }
}