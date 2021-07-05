import java.util.*;
public class Main {

    public static void swap(int []arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // approach 1 
    public static void reverse01(int []arr, int i, int j){
        if(i>=j){
            return;
        }

        swap(arr,i,j);
        reverse01(arr,i+1,j-1);
    }

    // approach 2 
    public static int[] reverse02(int []arr, int idx){
        if(idx==arr.length){
            int []base = new int[arr.length];
            return base;
        }

        int []ans = reverse02(arr,idx+1);
        ans[arr.length-idx-1] = arr[idx];
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

//        reverse01(arr,0,arr.length-1);
//        for(int ele: arr){
//            System.out.println(ele);
//        }

        int []ans = reverse02(arr,0);
        for(int ele: ans){
            System.out.println(ele);
        }
    }
}
