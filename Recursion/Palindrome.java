package Recursion;

public class Palindrome {
    public static boolean isPalindrome(String str, int start, int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return isPalindrome(str,start+1,end-1);
    }
    public static void main(String args[]){
        String str="racecav";
        int n=str.length();
        if(isPalindrome(str,0,n-1)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
