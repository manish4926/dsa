import java.util.Scanner;

/**
 * PythagoreanTriplet
 */
public class PythagoreanTriplet {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int temp;
        if(b > a && b > c) {
            temp = a;
            a = b;
            b = temp;
        } else if(c > a && c > b) {
            temp = a;
            a = c;
            c = temp;
        }

        if((int)Math.pow(a, 2) == (int)Math.pow(b, 2) + (int)Math.pow(c, 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        scn.close();

    }
}