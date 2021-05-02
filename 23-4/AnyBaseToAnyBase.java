import java.util.Scanner;
import java.lang.Math;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int dec = getValueInDecimal(n, b1);
        int rv = getValueInBase(dec, b2);
        System.out.println(rv);
        scn.close();
    }

    public static int getValueInDecimal(int n, int b1) {
        
        int rv = 0;
        int i = 0;
        while(n > 0 ) {
            int d = n % 10;
            n = n / 10;
            rv = rv + (d * (int)Math.pow(b1, i));
            i++;
        }
        return rv;
    }

    public static int getValueInBase(int n, int b2) {

        int rv = 0;
        int i = 0;
        while (n > 0) {
            int d = n % b2;
            n = n / b2;
            rv = rv + (d * (int) Math.pow(10, i));
            i++;
        }
        return rv;
    }
}
