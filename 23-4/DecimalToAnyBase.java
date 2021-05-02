import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int currentBase = 10;
        int toBase = scn.nextInt();;

        int d = getValueFromdecimal(n, currentBase, toBase);
        System.out.println(d);
        scn.close();
    }

    public static int getValueFromdecimal(int n, int currentBase, int toBase) {
        int i = 0;
        int val = 0;
        while(n > 0) {
            //System.out.println(n);
            int d = n % toBase;
            n = n / toBase;

            val = val +  (d * (int)Math.pow(currentBase, i));
            i++;
        }
        return val;
    }
}
