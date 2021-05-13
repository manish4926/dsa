import java.io.*;
import java.util.*;

public class PepportalSpecialPrice {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        // Scanner scn = new Scanner(System.in);
        // int nr = scn.nextInt();
        int nr = 4;
        int nc = nr;

        int mat[][] = new int[nr][nc];
        // Input
        // for(int i = 0;i<nr;i++)
        // {
        // for (int j = 0; j < nc; j++) {
        // mat[i][j] = scn.nextInt();
        // }
        // }
        mat[0][0] = 11;
        mat[0][1] = 12;
        mat[0][2] = 13;
        mat[0][3] = 14;

        mat[1][0] = 21;
        mat[1][1] = 22;
        mat[1][2] = 23;
        mat[1][3] = 24;

        mat[2][0] = 31;
        mat[2][1] = 32;
        mat[2][2] = 33;
        mat[2][3] = 34;

        mat[3][0] = 41;
        mat[3][1] = 42;
        mat[3][2] = 43;
        mat[3][3] = 44;

        int higherrow = 0;
        for (int i = 1; i < nr; i++) {
            if (mat[i][0] > mat[i - 1][0]) {
                higherrow = i;
            }
        }
        System.out.println(higherrow);

        int leastcolumn = nc - 1;

        for (int j = nc - 2; j >= 0; j--) {

            if (mat[higherrow][j] < mat[higherrow][j + 1]) {

                leastcolumn = j;
            }
        }
        System.out.println(leastcolumn);

        System.out.println(mat[higherrow][leastcolumn]);

        //scn.close();
    }
    
}
