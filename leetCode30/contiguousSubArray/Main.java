import java.util.*;

class Main{
  public static int contiguousArray(int givenArr[])
  {
    List<Integer> givenList = new ArrayList<Integer>();
    for(int a : givenArr)
      givenList.add(a);
    
      int sum = 0,maxCount=0,count=0;

    for(int i = 0;i<givenList.size();i++){
      if(givenList.get(i)==1)
      sum = 1;
      else if(givenList.get(i) == 0)
      sum = -1;
      for(int j = i+1;j<givenList.size();j++){

        //inner loop
        if(givenList.get(j)==1)
          ++sum;
        else if(givenList.get(j)==0)
          --sum;

        //contiguous checked
        if(sum == 0)
        {
          count = (j-i+1);
          if(count>maxCount)
          {
            maxCount = count;
          }
        }
      }
    }
      return maxCount;
  }
  public static void main(String[] args) {
    int givenArr[] = new int[] {0,1,1};
     
    System.out.println(contiguousArray(givenArr));
  }
}