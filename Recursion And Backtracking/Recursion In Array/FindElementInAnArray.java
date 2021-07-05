import java.util.*;
public class Main {

    public static boolean findElement(int []arr, int idx, int tar){
        if(idx==arr.length){
            return false;
        }

        return arr[idx]==tar || findElement(arr,idx+1,tar);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();
        boolean ans = findElement(arr,0,tar);
        System.out.println(ans);
    }
}
