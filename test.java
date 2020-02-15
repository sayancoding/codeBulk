class Test
{

    public static void main(String[] args) {
        int[] listing = new int[] {0,1,0,0,1,0,1,1};
        int prevPtr= 0,endPtr = (listing.length - 1);
        int sortedArr[] = new int[listing.length];
    
        for(int i = 0;i<listing.length;i++)
        {
            if(listing[i]==0)
                sortedArr[prevPtr++] = listing[i];
            else
                sortedArr[endPtr--] = listing[i];
        }
        for(int i = 0;i<listing.length;i++)
            System.out.print(sortedArr[i]+" ");    
    }
}