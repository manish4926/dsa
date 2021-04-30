import java.util.Scanner;
public class InverseANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rv = 0;

        int i = 1;
        while(n > 0) {
            int k = n % 10;
            n = n / 10;
            
            rv = rv + (i * (int)Math.pow(10, k -1));
            //System.out.println(rv);
            i++;
        }
        System.out.println(rv);
        scn.close();
    }
}
