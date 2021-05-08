import java.util.Scanner;

public class DiagonalTraversal2dArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        for (int gap = 0; gap < n; gap++) {

            for (int i = 0, j = gap; i < mat.length && j < mat.length; i++, j++) {
                System.out.println(mat[i][j]);
            }

        }
        scn.close();        
    }
}
