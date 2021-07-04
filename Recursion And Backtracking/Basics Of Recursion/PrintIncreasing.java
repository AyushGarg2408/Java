import java.util.*;
public class Main {

    public static void printIncreasing(int a, int b){
        if(a>=b){
            if(a==b){
                System.out.println(a);
            }
            return;
        }

        System.out.println(a);
        printIncreasing(a+1,b);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        printIncreasing(a,b);
    }
}
