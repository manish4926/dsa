import java.util.Scanner;

public class FindElementInArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }

        int fndval = scn.nextInt();

        int res = findVal(arr, fndval);

        System.out.println(res);

        scn.close();
    }

    public static int findVal(int arr[], int x) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == x) {
                return idx;
            }
        }
        return -1;
    }

}