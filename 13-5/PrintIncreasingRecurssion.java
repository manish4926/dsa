import java.util.Scanner;

public class PrintIncreasingRecurssion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);

        scn.close();
    }

    public static void printIncreasing(int val) {
        if (val == 0) {
            return;
        }

        printIncreasing(val - 1);
        System.out.println(val);

    }

}
