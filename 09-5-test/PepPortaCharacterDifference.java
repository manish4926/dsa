import java.util.*;

public class PepPortaCharacterDifference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String sch = scn.next();
        String res = sch.charAt(0)+"";
        for (int i = 1; i < sch.length(); i++) {
            int val = sch.charAt(i) - sch.charAt(i - 1);
            res = res + val + sch.charAt(i);
        }

        System.out.println(res);
        scn.close();
        
    }    
}
