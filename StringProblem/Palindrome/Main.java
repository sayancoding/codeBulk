class Main
{
    static String str = "abcba";

    // main palindrome check calling
    public static void isPalindrome(String st) {

        boolean status = true;
        int len = st.length();
        if(len % 2 == 0 && len>2)
        {
            int middle  = len/2;
            int middleUp = middle+1;
            while(middle>=0 && middleUp<len)
            {
                if(st.charAt(middle--) != st.charAt(middleUp++))
                {
                    status = false;
                    break;
                }
            }
            System.out.println(status);
        }
        else if(len % 2 != 0 && len > 3)
        {
            int middle  = len/2;
            int middleLow = middle-1;
            int middleUp = middle+1;
            while(middleLow>=0 && middleUp<len)
            {
                if(st.charAt(middleLow--) != st.charAt(middleUp++))
                {
                    status = false;
                    break;
                }
            }
            System.out.println(status);
        }
    }

    public static void main(String[] args) {
        isPalindrome(str);
    }
}