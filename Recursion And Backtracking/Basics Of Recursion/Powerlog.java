import java.util.*;
public class Main {

    public static int power(int n, int x){
        if(x==0){
            return 1;
        }

        int ans = power(n,x/2);
        ans = ans * ans;

        return x%2==0? ans: ans * n;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();

        int ans = power(n,x);
        System.out.println(ans);
    }
}
