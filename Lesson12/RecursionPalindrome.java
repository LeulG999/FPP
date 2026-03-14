package lesson4;
public class RecursionPalindrome {
    private static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        int lastDigit=n%10;
        return reverse(n/10,rev*10+lastDigit);
    }
    public static boolean isPalindrome(int n){
       if(n<0)return false;
       return n==reverse(n,0);
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(122));
    }
}

