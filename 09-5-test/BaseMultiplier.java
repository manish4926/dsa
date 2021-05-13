import java.util.Scanner;

public class BaseMultiplier {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getMultiplier(b, n1, n2);
        System.out.println(d);

        scn.close();
    }

    public static int getMultiplier(int base, int n1, int n2) {
        int result = 0;
        int pow = 1;
        int carry = 0;
        while (n2 > 0 || carry > 0) {
            //int d1 = n1 % 10;
            int d1 = n1;
            int d2 = n2 % 10;

            int multi = (d1 * d2) + carry;
            int digit = multi % base;
            carry = multi / base;
            

            result = (digit * pow) + result;
            

            //n1 = n1;
            n2 = n2 / 10;
            pow = pow * 10;
        }
        return result;
    }

}
