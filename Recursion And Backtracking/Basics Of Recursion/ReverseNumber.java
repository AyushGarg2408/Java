import java.util.*;
public class Main {

    public static int reverseNumber(int n, int div){
        if(n==0){
            return 0;
        }

        int rem = n / div;
        int ans = reverseNumber((n%div), div/10);
        ans = (ans * 10) + rem;
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
        int ans = reverseNumber(n,div);
        System.out.println(ans);
    }
}
