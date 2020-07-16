
class Main {

  static public void decryptPassword(String s){
    int index = 0;
    int numberIndex = 0;
    String finalString = "";
    for(int i = 0;i<s.length();i++){
      if((int)s.charAt(i)>57){
        index = i;
        numberIndex = i-1;
        break;
      }
    }
    while(index < s.length()){
      if(s.charAt(index) >= 'A' && s.charAt(index)<='Z' ){
        if(index+1 < s.length()){
          if(s.charAt(index+1) >= 'a' && s.charAt(index+1) <='z' ){
            finalString = finalString+s.charAt(index+1)+s.charAt(index);
            index += 3;
          }else{
            finalString = finalString + s.charAt(index);
            index++;
          }
        }else{
          finalString = finalString + s.charAt(index);
          index++;
        }
      }
      else if(s.charAt(index) >= 'a' && s.charAt(index) <= 'z'){
        finalString = finalString + s.charAt(index);
        index++;
      }
      else if(s.charAt(index)=='0'){
        finalString = finalString+s.charAt(numberIndex);
        index++;
        numberIndex--;
      }
      else{
        index++;
      }
    }
    System.out.println(finalString);
  }

  public static void main(String[] args) {
    String encrypt = "43Ah*cK0rr0nK";
    decryptPassword(encrypt);
  }
}