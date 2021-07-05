import java.util.*;
public class Main {

    public static String reverse(String str){
        if(str.length()==0){
            String  base = new String("");
            return base;
        }

        String ans = reverse(str.substring(1));
        ans = ans + str.charAt(0);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        String ans = reverse(str);
        System.out.println(ans);
    }
}
