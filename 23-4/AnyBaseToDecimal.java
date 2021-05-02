import java.lang.Math;
import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int i = 0;
        int val = 0;

        while(n > 0) {
            
            int d = n % 10;
            n = n / 10;
            val = val + (d * ((int)Math.pow(b, i)));
            i++;
        }
        return val;
    }
}
