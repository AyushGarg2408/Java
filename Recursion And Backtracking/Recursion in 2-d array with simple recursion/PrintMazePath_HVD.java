import java.util.*;
public class Main {

    public static int MazePath_HVD(int sr, int sc, int er, int ec, String ans){
        if(sr==er && sc==ec){
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        if(sc+1<=ec){
            count+= MazePath_HVD(sr,sc+1,er,ec,ans+"H");
        }

        if(sr+1<=er){
            count+= MazePath_HVD(sr+1,sc,er,ec,ans+"V");
        }

        if(sr+1<=er && sc+1<=ec){
            count+= MazePath_HVD(sr+1,sc+1,er,ec,ans+"D");
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
