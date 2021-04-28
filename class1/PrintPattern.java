import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < i; j++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.print("\n");
        // }

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
        
        scn.close();
    }
}
