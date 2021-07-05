import java.util.*;
public class Main {

    public static void printSubsequence(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String rest = str.substring(1);

        printSubsequence(rest,ans+ch);
        printSubsequence(rest,ans);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSubsequence(str,"");
    }
}
