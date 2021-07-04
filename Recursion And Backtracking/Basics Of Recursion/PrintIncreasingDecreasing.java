import java.util.*;
public class Main {

    public static void printIncreasingDecreasing(int a, int b){
        if(a>=b){
            if(a==b){
                System.out.println(a);
                System.out.println(a);
            }
            return;
        }

        System.out.println(a);
        printIncreasingDecreasing(a+1,b);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        printIncreasingDecreasing(a,b);
    }
}
