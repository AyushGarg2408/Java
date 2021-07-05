import java.util.*;
public class Main {

    public static ArrayList<String> getStairPath(int n){
        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();

        if(n-1>=0){
            ArrayList<String> recAns = getStairPath(n-1);
            for(String s: recAns){
                myAns.add("1" + s);
            }
        }

        if(n-2>=0){
            ArrayList<String> recAns = getStairPath(n-2);
            for(String s: recAns){
                myAns.add("2" + s);
            }
        }

        if(n-3>=0){
            ArrayList<String> recAns = getStairPath(n-3);
            for(String s: recAns){
                myAns.add("3" + s);
            }
        }

        return myAns;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String > ans = getStairPath(n);
        System.out.println(ans);
    }
}
