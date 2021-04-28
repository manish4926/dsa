import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int count = 0;
        int d1;
        while(n > 0) {
            d1 = n % 10;
            n = n / 10;    
            if(d == d1) {
                count++;
            }
        }
        return count;
    }
}
