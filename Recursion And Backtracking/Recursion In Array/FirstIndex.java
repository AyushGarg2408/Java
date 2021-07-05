import java.util.*;
public class Main {


    // approach 1
    public static int firstIndex01(int []arr, int idx, int tar){
        if(idx==arr.length){
            return -1;
        }

        return arr[idx]==tar? idx : firstIndex01(arr,idx+1,tar);
    }

    // approach 2
    public static int firstIndex02(int []arr, int idx, int tar){
        if(idx==arr.length){
            return -1;
        }

        int ans = firstIndex02(arr,idx+1,tar);
        return arr[idx]==tar? idx : ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

//        int ans = firstIndex01(arr,0,tar);
//        System.out.println(ans);

        int ans2 = firstIndex02(arr,0,tar);
        System.out.println(ans2);
    }
}
