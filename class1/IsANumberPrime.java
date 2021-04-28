import java.util.Scanner;

public class IsANumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();
        for(int m = 0; m < t; m++) {
            int checknum = scn.nextInt();
            boolean flag = false;

            for (int i = 2; i < checknum - 1; i++) {
                if (checknum % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (flag == false) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        
    }
}
