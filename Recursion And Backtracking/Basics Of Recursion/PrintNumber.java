import java.util.*;
public class Main {

    // approach 1
    public static int printNumber01(int n){
        if(n==0){
            return 0;
        }

        int rem = n % 10;
        int ans = printNumber01(n / 10);
        ans = (ans * 10) + rem;
        return ans;
    }

    // approach 2
    public static int printNumber02(int n, int div){
        if(n==0){
            return 0;
        }

        int rem = n / div;
        int ans = printNumber02((n%div), div/10);
        ans = (rem * div) + ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

//        int ans1 = printNumber01(n);
//        System.out.println(ans1);

        int count = 0;
        int temp = n;
        while(temp!=0){
            count++;
            temp/=10;
        }

        int div = (int)Math.pow(10,count-1);
        int ans2 = printNumber02(n,div);
        System.out.println(ans2);
    }
}
