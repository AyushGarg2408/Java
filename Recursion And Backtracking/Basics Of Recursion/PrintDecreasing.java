import java.util.*;
public class Main {

    public static void printDecreasing(int a, int b){
        if(a>=b){
            if(a==b){
                System.out.println(a);
            }
            return;
        }

        printDecreasing(a+1,b);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        printDecreasing(a,b);
    }
}
