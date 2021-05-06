import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arrSize = scn.nextInt();
        int arr[] = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = scn.nextInt();
        }

        reverse(arr);
        display(arr);
        scn.close();    
    }

    public static void reverse(int[] a) {
        // write your code here
        int low = 0;
        int high = a.length - 1;

        while(low < high) {
            int tmp = a[low];
            a[low] = a[high];
            a[high] = tmp;

            low++;
            high--;
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
