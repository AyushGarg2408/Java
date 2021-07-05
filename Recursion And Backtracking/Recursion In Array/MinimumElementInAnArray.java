import java.util.*;
public class Main {

    public static int minimum(int []arr, int idx){
        if(idx==arr.length){
            return (int)1e9;
        }

        int ans = minimum(arr,idx+1);
        return Math.min(ans,arr[idx]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }


        int ans = minimum(arr,0);
        System.out.println(ans);
    }
}
