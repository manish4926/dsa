import java.util.Scanner;

public class DifferenceOfTwoArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a1 = scn.nextInt();

        int arr1[] = new int[a1];
        for (int i = 0; i < a1; i++) {
            arr1[i] = scn.nextInt();
        }

        int a2 = scn.nextInt();

        int arr2[] = new int[a2];
        for (int i = 0; i < a2; i++) {
            arr2[i] = scn.nextInt();
        }

        int reslength = a1 > a2 ? a1 : a2;

        int res[] = new int[reslength];
        int p1 = a1 - 1, p2 = a2 - 1, p3 = reslength - 1, borrow = 0;

        while(p1 >= 0 || p2 >= 0 || borrow > 0) {
            int d1 = p1 < 0 ? 0 : arr1[p1];
            int d2 = p2 < 0 ? 0 : arr2[p2];

            int diff = d2 - d1 - borrow;

            if (diff < 0) {
                borrow = 1;
                diff = diff + 10;
            } else {
                borrow = 0;
            }
            res[p3] = diff % 10;

            p1--;
            p2--;
            p3--;
            
        }
        
        boolean flag = false;
        for (int i = 0; i < reslength; i++) {
            if(res[i] != 0) {
                flag = true;
            }
            if(flag) {
                System.out.println(res[i]); //Ignoring 0 Values
            }
        }
        scn.close();
    }
}
