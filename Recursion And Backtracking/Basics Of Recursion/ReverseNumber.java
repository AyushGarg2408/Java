import java.util.*;
public class Main {

    // approach 1
    public static int reverseNumber01(int n, int div){
        if(n==0){
            return 0;
        }

        int rem = n / div;
        int ans = reverseNumber01((n%div), div/10);
        ans = (ans * 10) + rem;
        return ans;
    }

    // approach 2
    public static int reverseNumber02(int n, int mul){
        if(n==0){
            return 0;
        }

        int rem = n % 10;
        int ans = reverseNumber02(n/10,mul/10);
        ans = (rem * mul) + ans;
        return ans;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 0, temp = n;
        while (temp!=0){
            count++;
            temp/=10;
        }

        int div = (int)Math.pow(10,count-1);
//        int ans = reverseNumber01(n,div);
//        System.out.println(ans);

        int ans2 = reverseNumber02(n,div);
        System.out.println(ans2);
    }
}
