import java.util.Scanner;


public class MaxOfAnArrayRecurssion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        int res = maxOfArray(arr, 0);
        System.out.println(res);
        scn.close();
    }

    public static int maxOfArray(int[] arr, int idx) {
        if(idx == arr.length) {
            return Integer.MIN_VALUE;
        }
        int res = maxOfArray(arr, idx + 1);
        if(res > arr[idx]) {
            return res;
        } else {
            return arr[idx];
        }
    }
}
