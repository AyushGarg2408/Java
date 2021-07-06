import java.util.*;
public class Main {

    public static ArrayList<String> MazePath_HVD(int sr, int sc, int er, int ec){
        if(sr==er && sc==ec){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        if(sc+1<=ec){
            ArrayList<String> hr = MazePath_HVD(sr,sc+1,er,ec);
            for(String s: hr){
                myAns.add("H" + s);
            }
        }

        if(sr+1<=er){
            ArrayList<String> ver = MazePath_HVD(sr+1,sc,er,ec);
            for(String s: ver){
                myAns.add("V" + s);
            }
        }

        if(sr+1<=er && sc+1<=ec){
            ArrayList<String> dia = MazePath_HVD(sr+1,sc+1,er,ec);
            for(String s: dia){
                myAns.add("D" + s);
            }
        }

        return myAns;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int er = scn.nextInt();
        int ec = scn.nextInt();
        ArrayList<String> ans = MazePath_HVD(0,0,er-1,ec-1);
        System.out.println(ans);
    }
}
