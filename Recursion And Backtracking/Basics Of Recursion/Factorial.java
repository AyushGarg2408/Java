import java.util.*;
public class Main {

    public static int factorial(int n){
        if(n==0){
            return 1;
        }

        int ans = factorial(n - 1);
        ans = ans * n;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n<0){
            System.out.println("factorial of negative number cant be calculated");
            return;
        }

        int ans = factorial(n);
        System.out.println(ans);
    }
}
