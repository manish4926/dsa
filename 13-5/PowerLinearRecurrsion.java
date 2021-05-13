import java.util.Scanner;

public class PowerLinearRecurrsion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int res = powLinear(n,k);

        System.out.println(res);
        scn.close();
    }

    public static int powLinear(int n, int k) {
        if(k == 0) {
            return 1;
        }

        int v = powLinear(n, k-1) * n;
        return v;
    }
}
