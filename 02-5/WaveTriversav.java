import java.util.Scanner;

public class WaveTriversav {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int mat[][] = new int[nr][nc];
        // Input
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        //Output
        for (int j = 0; j < nc; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < nr; i++) {
                    System.out.println(mat[i][j]);
                }
            } else {
                for (int i = nr - 1; i >= 0; i--) {
                    System.out.println(mat[i][j]);
                }
            }
            // System.out.print("\n");
        }

        scn.close();
    }
}
