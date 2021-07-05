import java.util.*;
public class Main {

    public static ArrayList<String > getSubsequences(String str){
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String > recAns = getSubsequences(str.substring(1));
        ArrayList<String> myAns = new ArrayList<>(recAns);

        for(String s: recAns){
            myAns.add(str.charAt(0) + s);
        }

        return myAns;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        ArrayList<String > ans = getSubsequences(str);
        System.out.println(ans);
    }
}
