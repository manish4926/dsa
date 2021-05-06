import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        // int temp;
        // if(n2 > n1) {
        //     temp = n1;
        //     n1 = n2;
        //     n2 = temp;
        // }

        int d = getDifference(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getDifference(int base, int n1, int n2) {
        int result = 0;
        int pow = 1;
        int borrow = 0;
        

        while (n1 > 0 || n2 > 0 || borrow > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int diff = d2 - d1 - borrow;
            //int digit = diff % base;
            if(diff < 0) {
                borrow = 1;
                diff = diff + base;
            } else {
                borrow = 0;
            }
            
            result = (diff * pow) + result;

            n1 = n1 / 10;
            n2 = n2 / 10;
            pow = pow * 10;
        }

        return result;
    }
}
