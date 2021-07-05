import java.util.*;
public class Main {

    public static ArrayList<String> getNokiaKeypad(String str, String []keys){
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> recAns = getNokiaKeypad(str.substring(1),keys);
        
        ArrayList<String> myAns = new ArrayList<>();
        
        int val = str.charAt(0) - '0';
        String s = keys[val];
        for(int i = 0; i<s.length(); i++){
            for(String st: recAns){
                myAns.add(s.charAt(i) + st);
            }
        }
        
        return myAns;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[]keys = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
        
        String str = scn.next();
        ArrayList<String> ans = getNokiaKeypad(str,keys);
        System.out.println(ans);
    }
}
