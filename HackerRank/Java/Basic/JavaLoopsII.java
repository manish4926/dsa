import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                //int x = a + (int)Math.pow(2, j) * b;
                int x = a;
                for (int k = 0; k <= j; k++) {
                    x = x + (int)Math.pow(2, k) * b;
                }
                System.out.print(x+" ");
            }
        }

        System.out.print("\n");

    
            
        in.close();    
    }
    
}
