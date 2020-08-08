import java.util.Arrays;

public class Main{
  static int miniRadio(int[] arr,int k){
    int count = 0;
    
    int i = 0;
    int j = 0;
    int m = 0;
    while(m<arr.length && j <arr.length && i<arr.length){
      if(arr[j] - arr[i] <= k){
        j++;
      }else{
        count++;
        j--;
        m = j+1;
        while(m<arr.length){
          if(arr[m] - arr[j] <= k){
            m++;
          }else{
            m--;
            break;
          }
        }
        i = m+1;
        j = i;
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        // break;
      }
    }
    if(m < arr.length){
      count++;
    }
    System.out.println(count+" "+i+" "+j+" "+m);

    return count;
  }
  public static void main(String[] args) {
    int[] arr = new int[] {2,4,5,6,9,12,15};
    // int[] arr = new int[] {7 ,2 ,4, 6, 5, 9, 12, 11};
    // int[] arr = new int[] {1 ,2 ,3 ,4 ,5};
    Arrays.sort(arr);
    int k = 2;
    miniRadio(arr, k);
  }
}