import java.util.*;
public class Main {

    public static ArrayList<String> MazePath_HVD(int sr, int sc, int er, int ec){
        if(sr==er && sc==ec){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();

        for(int jump=1; jump+sc<=ec; jump++){
            ArrayList<String> hr = MazePath_HVD(sr,sc+jump,er,ec);
            for(String s: hr){
                myAns.add("H" + jump + s);
            }
        }

        for(int jump=1; jump+sr<=er; jump++){
            ArrayList<String> ver = MazePath_HVD(sr+jump,sc,er,ec);
            for(String s: ver){
                myAns.add("V" + jump + s);
            }
        }

        for(int jump=1; jump+sc<=ec && jump+sr<=er; jump++){
            ArrayList<String> dia = MazePath_HVD(sr+jump,sc+jump,er,ec);
            for(String s: dia){
                myAns.add("D" + jump + s);
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
