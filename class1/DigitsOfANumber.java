import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
     
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int lenght = 0;

        while(temp>0) {
            temp = temp / 10;
            lenght++;
        }

        while(lenght !=0 ) {
            int digit = n / (int)Math.pow(10, lenght - 1);
            System.out.println(digit);
            n = n %  (int) Math.pow(10, lenght - 1);
            lenght--;
        }

        scn.close();
    }
    
}