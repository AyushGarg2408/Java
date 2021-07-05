import java.util.*;
public class Main {

    public static int sum(String str){
        if(str.length()==0){
            return 0;
        }

        int ans = sum(str.substring(1));
        ans = ans + (str.charAt(0) - '0');
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int ans = sum(str);
        System.out.println(ans);
    }
}
