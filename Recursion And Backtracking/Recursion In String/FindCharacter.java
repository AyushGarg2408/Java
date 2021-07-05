import java.util.*;
public class Main {

    public static boolean findCharacter(String str, char ch){
        if(str.length()==0){
            return false;
        }

        return str.charAt(0)==ch || findCharacter(str.substring(1),ch);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char ch = scn.next().charAt(0);

        boolean ans = findCharacter(str,ch);
        System.out.println(ans);
    }
}
