import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        if(n % 2 != 0 || (n >= 6 &&  n <= 20)) {
            System.out.print("Weird");
        } else  {
            System.out.print("Not Weird");
        }
    }
}
