import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int mat[][] = new int[nr][nc];
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        int rmin = 0, cmin = 0, rmax = mat.length-1, cmax = mat[0].length-1;
        // for (int i = rmin, j = cmin; i <= rmax; i++) {
        //     System.out.println(mat[i][j]);
        // }
        while(rmin < rmax && cmin < cmax) {
            System.out.println(mat[rmin][rmax]);
            rmin++;
            rmax++;
        }
        

        scn.close();
    }
}
