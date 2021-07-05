import java.util.*;
public class Main {

    public static void printPath(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }

        if(n-1>=0){
            printPath(n-1,ans + "1");
        }

        if(n-2>=0){
            printPath(n-2,ans + "2");
        }

        if(n-3>=0){
            printPath(n-3,ans + "3");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printPath(n,"");
    }
}
