import java.util.*;
public class Main {

    public static void display(int []arr, int idx){
        if(idx==arr.length){
            return;
        }

        display(arr,idx+1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        display(arr,0);
    }
}
