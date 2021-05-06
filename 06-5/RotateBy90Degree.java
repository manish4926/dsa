import java.util.Scanner;

public class RotateBy90Degree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int nr = scn.nextInt();
        // int nc = scn.nextInt();

        int nr = 4;
        int nc = 4;

        int mat[][] = new int[nr][nc];
        // for(
        // int i = 0;i<nr;i++)
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

        int res[][] = new int[nr][nc];
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                res[i][j] = mat[j][i];
            }
        }

        display(res);
        scn.close();    
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
