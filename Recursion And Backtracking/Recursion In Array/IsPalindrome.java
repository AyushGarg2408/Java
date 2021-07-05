import java.util.*;
public class Main {

    public static boolean isPalindrome(int []arr, int i, int j){
        if(i>=j){
            return true;
        }

        return arr[i]!=arr[j]? false: isPalindrome(arr,i+1,j-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        boolean ans = isPalindrome(arr,0,arr.length-1);
        System.out.println(ans);
    }
}
