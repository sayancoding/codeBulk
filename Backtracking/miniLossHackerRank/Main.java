class Main {
  static long minimumLoss(long[] price,int index,long min){
    if(index == price.length)
    return min;

    int n = price.length;
    long firstValue = price[index];
    for(int i = index+1;i<n;i++){
      if(firstValue >= price[i]){
        min = Math.min(min, (firstValue - price[i]));
      }
    }
    min = minimumLoss(price, index+1, min);
    return min;
  }
  public static void main(String[] args) {
    long[] price = new long[] {5, 10, 4};
    System.out.println(minimumLoss(price, 0, Long.MAX_VALUE));
  }  
}