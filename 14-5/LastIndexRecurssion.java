import java.util.Scanner;

public class LastIndexRecurssion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        int res = lastIndex(arr, 0, x);
        System.out.println(res);
        scn.close();
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }

        
        int res = lastIndex(arr, idx + 1, x);

        if(res == -1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        }
        

        return res;
    }
}
