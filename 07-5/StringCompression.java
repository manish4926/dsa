import java.util.*;

public class StringCompression {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));

        scn.close();
    }


    public static String compression1(String str) {
        // write your code here
        String res = str.charAt(0) + "";
        for (int i = 1; i < str.length() - 1; i++) {
            char cc = str.charAt(i);
            char pc = str.charAt(i-1);
            
            
            if(cc!=pc) {
                res = res + cc;
            }
            
        }
        return res;
    }

    public static String compression2(String str) {
        // write your code here
        String res = str.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char cc = str.charAt(i);
            char pc = str.charAt(i - 1);
            
            if (cc == pc) {
                count = count + 1;
            } else {
                
                if(count > 1) {
                    res = res + count;
                    count = 1;
                }
                res = res + cc;
            }

        }

        if (count > 1) {
            res = res + count;
        }
        return res;
    }
}
