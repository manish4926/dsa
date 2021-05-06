import java.util.Scanner;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arrSize = scn.nextInt();
        int arr[] = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        rotate(arr, k);
        display(arr);
        scn.close();
    }   

    public static void rotate(int[] a, int k) {
        // write your code here
        int n = a.length;
        k = k % n;
        if(k < 0) {
            k = k + n;
        }

        int tmp;
        for (int i = 0; i < k; i++) {
            tmp = a[a.length - 1];
            for(int j = a.length - 1; j > 0; j--) {
                a[j] = a[j-1];
            }
            a[0] = tmp;
        }
    }

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }


    
}
