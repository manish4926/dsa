import java.util.Scanner;

public class FabonniciRecurssion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int res = fib(n);
        System.out.println(res);
        scn.close();    
    }

    public static int fib(int n) {
        if(n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }
        int fibNm1 = fib(n-1);
        int fibNm2 = fib(n - 2);

        int res = fibNm1 + fibNm2;
        return res;
    }
    
}
