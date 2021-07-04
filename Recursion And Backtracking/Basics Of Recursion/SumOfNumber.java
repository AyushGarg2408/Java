import java.util.*;
public class Main {

    public static int sum(int n){
        if(n==0){
            return 0;
        }

        int ans = sum(n/10);
        ans = ans + (n%10);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = sum(n);
        System.out.println(ans);
    }
}
