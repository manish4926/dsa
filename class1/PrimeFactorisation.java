import java.util.Scanner;

public class PrimeFactorisation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int divisor = 2;
        while(n > 1) {
            while(n % divisor <= 0) {
                n = n / divisor;
                System.out.print(divisor + " ");
            }
            divisor++;
        }
        

        scn.close();
    }
    
}