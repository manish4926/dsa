import java.util.Scanner;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int i = low; i <= high; i++) {
            boolean flag = false;
            for(int j = 2; j <= i/2; j++) {
                if(i % 2 == 0) {
                    flag = true;
                    break;
                }
                if(i % j == 0) {
                    flag = true;
                    break;
                }
            }

            if(flag == false) {
                System.out.println(i);  
            }
        }
    }
}