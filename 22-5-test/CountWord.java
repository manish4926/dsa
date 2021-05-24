import java.util.Scanner;

public class CountWord {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        String str = "the the thethe";

        System.out.println(countWord(str, 0));

        scn.close();
    }

    public static int countWord(String str, int idx) {
        if (idx >= str.length() - 1) {
            return 0;
        }

        //int foundval = -1;
        int res = 0;
        
        str = str.substring(idx);
        int foundval = str.indexOf("the");
        if(foundval != -1) {
            
            res = countWord(str, foundval + 3);
            res = res + 1;
            //System.out.println(res);
        }
        
        
        
        
        // System.out.println(str.indexOf("he"));
        return res;
    }
}