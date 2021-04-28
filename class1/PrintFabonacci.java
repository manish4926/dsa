import java.util.Scanner;

public class PrintFabonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int start = 0;
        int end = 1;
        for(int i = 0; i < n -2; i++) {
            int c = start + end;
            start = end;
            end = c;
            System.out.println(c);
        }

        scn.close();
    }
    
}