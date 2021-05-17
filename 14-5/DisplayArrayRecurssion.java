import java.util.Scanner;

public class DisplayArrayRecurssion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        
        //int n = scn.nextInt();
        displayArr(arr, 0);
        scn.close();
    }

    public static void displayArr(int[] arr, int idx) {
        if(idx >= arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx+1);

    }
}
