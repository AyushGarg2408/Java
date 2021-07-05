import java.util.*;
public class Main {

    // approach 1
    public static int lastIndex01(int []arr, int idx, int tar){
        if(idx<0){
            return -1;
        }

        return arr[idx]==tar? idx: lastIndex01(arr,idx-1,tar);
    }

    // approach 2
    public static int lastIndex02(int []arr, int idx, int tar){
        if(idx==arr.length){
            return -1;
        }

        int ans = lastIndex02(arr,idx+1,tar);
        if(ans!=-1){
            return ans;
        }else if(arr[idx]==tar){
            return idx;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();
//        int ans1 = lastIndex01(arr,arr.length-1,tar);
//        System.out.println(ans1);

        int ans2 = lastIndex02(arr,0,tar);
        System.out.println(ans2);
    }
}
