import java.util.Scanner;

public class ReverceANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int revnumber = 0;
        while(n > 0) {
            System.out.println(revnumber);
        }

        scn.close();
    }
}
