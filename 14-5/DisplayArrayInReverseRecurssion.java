import java.util.Scanner;

public class DisplayArrayInReverseRecurssion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        
        //int n = scn.nextInt();
        displayArrReverse(arr, 0);
        scn.close();
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx >= arr.length) {
            return;
        }
        
        displayArrReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
