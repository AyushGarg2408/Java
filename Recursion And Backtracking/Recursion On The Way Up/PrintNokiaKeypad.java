import java.util.*;
public class Main {

    public static void printKeypad(String str, String ans, String[]keys){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        int val = str.charAt(0);
        String s = keys[val-'0'];

        for(int i = 0; i<s.length(); i++){
            printKeypad(str.substring(1),ans+s.charAt(i),keys);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String[]keys = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

        printKeypad(str,"",keys);
    }
}
