import java.util.*;

public class SearchInASorted2dArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        int x = scn.nextInt();

        int i = 0; int j = n-1;

        while(j >= 0 && i < n) {
            if(mat[i][j] == x) {
                System.out.println(i);
                System.out.println(j);
                return;
            } else if(x < mat[i][j]) {
                j--;
            } else if(x > mat[i][j]) {
                i++;
            }
        }
        System.out.println("Not Found");
        scn.close();
    }
}
