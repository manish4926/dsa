import java.util.Scanner;

public class MatrixMultiplication {
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

        // Output
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        scn.close();
    }
}
