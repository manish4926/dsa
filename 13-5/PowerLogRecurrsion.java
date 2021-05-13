import java.util.Scanner;

public class PowerLogRecurrsion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int res = power(n,k);

        System.out.println(res);
        scn.close();
    }

    public static int power(int x, int n){
        if(n == 0) {
            return 1;
        }

        int xPowNBy2 = power(x, n/2);
        int xPowN = xPowNBy2 * xPowNBy2;
        if(n%2 == 1) {
            xPowN *= x;
        }
        return xPowN;
    }
}
