import java.io.*;
import java.util.*;

public class PrintAllPermutationsOfString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }

    public static int factorial(int n) {
        int k = 1;
        for (int i = 2; i <= n; i++) {
            k *= i;
        }
        return k;
    }

    public static void solution(String str) {
        int n = str.length();
        int fact = factorial(n);

        for (int i = 0; i < fact; i++) {
            int temp = i;
            StringBuffer sb = new StringBuffer(str);

            for (int j = n; j >= 1; j--) {
                int q = temp / j;
                int r = temp % j;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;
            }
            System.out.println();
        }

    }
}
