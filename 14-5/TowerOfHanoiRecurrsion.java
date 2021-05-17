import java.util.Scanner;

public class TowerOfHanoiRecurrsion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int src = scn.nextInt();
        int dest = scn.nextInt();
        int helper = scn.nextInt();

        toh(src, dest, helper, n );
        scn.close();
    }

    public static void toh(int src, int dest, int helper, int n) {
        if(n==0) {
            return;
        }

        toh(src, helper, dest, n-1);
        System.out.println(n+"["+src+" -> "+dest+"]");
        toh(helper, dest, src, n - 1);
    }
}
