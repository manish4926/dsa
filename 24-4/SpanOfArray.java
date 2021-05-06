import java.util.*;

public class SpanOfArray {

    public static int spanOfArray(int arr[]) {
        int max = Integer.MIN_VALUE; int min = Integer.MAX_VALUE;

        for(int val:arr) {
            if(val > max) {
                max = val;
            }
            if(val < min) {
                min = val;
            }
        }

        return max - min;
    }
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for(int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }

        int res = spanOfArray(arr);
        System.out.println(res);

        scn.close();
    }
}
