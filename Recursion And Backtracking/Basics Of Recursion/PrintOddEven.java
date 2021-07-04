import java.util.*;
public class Main {

    public static void printOddEven(int a, int b){
        if(a>=b){
            if(a==b){
                System.out.println(a);
            }
            return;
        }

        if(a%2!=0){
            System.out.println(a);
        }

        printOddEven(a+1,b);

        if(a%2==0){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        printOddEven(a,b);
    }
}
