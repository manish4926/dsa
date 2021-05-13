import java.util.Scanner;

public class FactorialRecurrsion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = factorial(n);
        System.out.println(res);   
        scn.close();    
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }

        int fact = n * factorial(n-1);
        return fact;
        

    }
    
}
