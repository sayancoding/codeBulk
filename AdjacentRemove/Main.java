import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Main
{
    static public int[] sumZero(int[] arr)
    {
        List<Integer> listingEl = new ArrayList<Integer>();
        for(int el:arr)
        listingEl.add(el);

        HashMap<Integer,Integer> sums = new HashMap<Integer,Integer>();
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            Integer prevIdx = sums.get(sum);
            if(prevIdx == null)
            {
                sums.put(sum, i);
                sum += arr[i]; 
            }
            else
            {
                showElements(listingEl,prevIdx,i);
                return Arrays.copyOfRange(arr, prevIdx, i);
            }
        }
        return null;
    }
    static public void showElements(List<Integer>list,int start,int end)
    {
        for(int i=0;i<list.size();i++)
        {
            if(i<start || i>=end)
            System.out.print(list.get(i)+" ");
        }
    } 
    public static void main(String[] args) {
        int[] number = new int[]{1,2,-5,1,2,-1,7};
        int[] result = new int[10];
        result = sumZero(number);
        // for(int el:result)
        // System.out.print(el+" "); 
    }
}