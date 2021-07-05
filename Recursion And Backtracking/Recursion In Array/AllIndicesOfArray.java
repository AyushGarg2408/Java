import java.util.*;
public class Main {

    public static int[] fillIndex(int []arr, int idx, int count, int tar){
        if(idx==arr.length){
            int []base = new int[count];
            return base;
        }

        if(arr[idx]==tar){
            count++;
        }

        int[] ans = fillIndex(arr,idx+1,count,tar);
        if(arr[idx]==tar){
            ans[count-1]  = idx;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        int []ans = fillIndex(arr,0,0,tar);
        for(int idx: ans){
            System.out.println(idx);
        }
    }
}
