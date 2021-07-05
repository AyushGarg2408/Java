import java.util.*;
public class Main {

    // approach 1
    public static void display01(String str){
        if(str.length()==0){
            return;
        }

        System.out.println(str.charAt(0));
        display01(str.substring(1));
    }

    // approach 2
    public static String display02(String str){
        if(str.length()==0){
            String base = new String("");
            return base;
        }

        String ans = display02(str.substring(1));
        ans = str.charAt(0) + ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

//        display01(str);

        String ans = display02(str);
        System.out.println(ans);
    }
}
