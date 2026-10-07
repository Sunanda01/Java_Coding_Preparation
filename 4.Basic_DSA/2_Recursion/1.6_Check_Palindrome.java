class Calc{
    static boolean isPalindrome(String s,int start,int end) {
        if(start>=end)
            return true;
        return (s.charAt(start)==s.charAt(end)) && isPalindrome(s,start+1,end-1);
    }
}

class 1.6_Check_Palindrome {
    public static void main(String[] args) {
        String s="abcdcba";
        int start=0;
        int end=s.length();
        System.out.println(Calc.isPalindrome(s,start,end-1));
    }
}