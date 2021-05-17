import java.io.*;
import java.util.*;

public class AllIndicesOfArrayRecurssion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int[] iarr = allIndices(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }

        scn.close();
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if(idx == arr.length) {
            int res[] = new int[fsf];
            return res;
        }

        if(arr[idx] == x) {
            int res[] = allIndices(arr, x, idx+1, fsf+1);
            res[fsf] = idx;
            return res;
        } else {
            int res[] = allIndices(arr, x, idx+1, fsf);
            return res;
        }
        
    }
}
