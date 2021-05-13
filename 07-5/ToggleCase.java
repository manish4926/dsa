import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str  = scn.next();

        System.out.println(toggleCas(str));
        
        scn.close();    
    }

    public static String toggleCas(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                char uc = (char)('A'+(ch-'a'));
                res = res +uc;
            } else if(ch >= 'A' && ch <= 'Z') {
                char lc = (char) ('a' + (ch - 'A'));
                res = res + lc;
            }
        }

        return res;
    }
}
