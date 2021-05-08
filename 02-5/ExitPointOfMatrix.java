import java.util.Scanner;

public class ExitPointOfMatrix {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();

        // int nr = 4;
        // int nc = 4;

        int mat[][] = new int[nr][nc];
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        // mat[0][0] = 0;
        // mat[0][1] = 0;
        // mat[0][2] = 1;
        // mat[0][3] = 0;

        // mat[1][0] = 1;
        // mat[1][1] = 0;
        // mat[1][2] = 0;
        // mat[1][3] = 0;

        // mat[2][0] = 0;
        // mat[2][1] = 0;
        // mat[2][2] = 0;
        // mat[2][3] = 0;

        // mat[3][0] = 1;
        // mat[3][1] = 0;
        // mat[3][2] = 1;
        // mat[3][3] = 0;

        int i = 0, j = 0, dir = 0;
        int prevI = 0, prevJ = 0;
        while (i < nr && j < nc) {
            // System.out.println("i: "+i+" j:"+j);
            if (mat[i][j] == 1) {
                dir++;
                dir = dir % 4;
            }
            prevI = i;
            prevJ = j;
            // System.out.println(dir);
            j = dir == 0 ? j + 1 : j;
            i = dir == 1 ? i + 1 : i;
            j = dir == 2 ? j - 1 : j;
            i = dir == 3 ? i - 1 : i;

        }
        System.out.println(prevI);
        System.out.println(prevJ);
        scn.close();
    }
}
