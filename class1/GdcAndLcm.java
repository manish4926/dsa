import java.util.Scanner;

public class GdcAndLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(); int n1 = a;
        int b = scn.nextInt(); int n2 = b;

        while(a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }

        int gcd = b;
        int lcm = (n1 * n2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        scn.close();
    }
}
