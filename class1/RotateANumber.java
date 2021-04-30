import java.util.Scanner;

public class RotateANumber {
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int t = 0;
        int rv = 0;

        //for k value greater than digits
        int temp = n;
        int length = 0;
        while (temp > 0) {
            temp = temp / 10;
            length = length + 1;
        }
        k = k % length;
        if(k < 0) {
            k = k + length;
        }

        for(int i = 0; i < k; i++) {
            int digit = n % 10;
            n = n / 10;
            t = (t * 10) + digit;
        }

        while(t > 0) {
            int digit = t % 10;
            t = t / 10;
            rv = (rv * 10) + digit;
        }

        temp = n;
        length = 0;

        while(temp > 0) {
            temp = temp / 10;
            length = length + 1;
        }

        rv = (rv * (int) Math.pow(10, length)) + n;


        System.out.print(rv);
        scn.close();
   } 
}
