import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arrSize = scn.nextInt();
        int arr[] = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = scn.nextInt();
        }

        int res[] = inverseArray(arr);
        display(res);
        scn.close();
    }

    public static int[] inverseArray(int[] a) {
        int len = a.length;
        int res[] = new int[len];
        for (int i = 0; i < len; i++) {
            res[a[i]] = i;
        }
        return res;
    }

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
}
