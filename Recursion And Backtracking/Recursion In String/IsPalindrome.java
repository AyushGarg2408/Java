import java.util.*;
public class Main {

    public static boolean isPalindrome(String str, int i, int j){
        if(i>=j){
            return true;
        }

        int diff = Math.abs(str.charAt(i) - str.charAt(j));
        return (diff!=0 && diff!=32)? false: isPalindrome(str,i+1,j-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        boolean ans = isPalindrome(str,0,str.length()-1);
        System.out.println(ans);
    }
}
