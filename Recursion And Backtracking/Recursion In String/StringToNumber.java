import java.util.*;
public class Main {

    // approach 1
    public static long stringToInteger01(String str){
        if(str.length()==0){
            return 0;
        }

        long rem = str.charAt(0) - '0';

        long ans = stringToInteger01(str.substring(1));

        long mul = (long)Math.pow(10,str.length()-1);
        ans = (rem*mul) + ans;
        return ans;

    }

    // approach 2
    public static long stringToInteger02(String str){
        if(str.length()==0){
            return 0;
        }

        int n = str.length();
        long rem = str.charAt(n-1) - '0';

        long ans = stringToInteger02(str.substring(0,n-1));
        ans = (ans * 10) + rem;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

//        long ans = stringToInteger01(str);
//        System.out.println(ans);

        long ans2 = stringToInteger02(str);
        System.out.println(ans2);
    }
}
