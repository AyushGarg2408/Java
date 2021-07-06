import java.util.*;
public class Main {

    public static int MazePath_HVD(int sr, int sc, int er, int ec, String ans){
        if(sr==er && sc==ec){
            System.out.println(ans);
            return 1;
        }

        int count = 0;

        for(int jump=1; jump+sc<=ec; jump++){
            count+= MazePath_HVD(sr,sc+jump,er,ec,ans + "H" + jump);
        }

        for(int jump=1; jump+sr<=er; jump++){
            count+= MazePath_HVD(sr+jump,sc,er,ec,ans + "V" + jump);
        }

        for(int jump=1; jump+sc<=ec && jump+sr<=er; jump++){
            count+= MazePath_HVD(sr+jump,sc+jump,er,ec,ans + "D" + jump);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int er = scn.nextInt();
        int ec = scn.nextInt();

        int ans = MazePath_HVD(0,0,er-1,ec-1,"");
        System.out.println(ans);
    }
}
