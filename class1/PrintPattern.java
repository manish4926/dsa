import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //int n = scn.nextInt();
        int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for(int j = 0; j < i; j++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.print("\n");
        // }

        
        // for (int i = n; i >= 1; i--) { 
        //     for (int j = i; j > 0; j--) {
        //         System.out.print("*\t"); 
        //     } System.out.print("\n"); 
        // }

        // for (int i = 1; i <= n; i++) {
        //     for(int j = n - i; j > 0; j--) {
        //         System.out.print("\t");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.print("\n");
        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print("\t");
        //     }
            
        //     for(int j = n + 1 - i; j > 0; j--) {
        //         System.out.print("*\t");
        //     }
            
        //     System.out.print("\n");
        // }


        
        // int k = Math.incrementExact(n / 2);
        // int d = 1;
        // for(int i = 1;i <= n; i++) {
        //     for(int j = k - 1; j > 0; j--) {
        //         System.out.print("\t");    
        //     }
        //     for (int j = 1; j <= d; j++) {
        //         System.out.print("*\t");
        //     }
        //     if(i >= Math.incrementExact(n / 2)) {
        //         k++;
        //         d = d-2;
        //     } else {
        //         k--;
        //         d = d+2;
        //     }
        //     System.out.print("\n");
        // }

        // int k = Math.incrementExact(n / 2);
        // int d = 1;
        // for(int i = 1;i <= n; i++) {
        //     for (int j = k ; j > 0; j--) {
        //         System.out.print("*\t");
        //     }
        //     for (int j = 1; j <= d; j++) {
        //         System.out.print("\t");
        //     }
        //     for (int j = k ; j > 0; j--) {
        //         System.out.print("*\t");
        //     }
        //     if(i >= Math.incrementExact(n / 2)) {
        //         k++;
        //         d = d-2;
        //     } else {
        //         k--;
        //         d = d+2;
        //     }
            
        //     System.out.print("\n");
        // }

        // for(int i = 1; i <= n; i++) {
        //     for(int k = 1; k < i; k++) {
        //         System.out.print("\t");    
        //     }
        //     System.out.print("*");
        //     System.out.print("\n");
        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int k = n+1-i; k > 1; k--) {
        //         System.out.print("\t");
        //     }
        //     System.out.print("*");
        //     System.out.print("\n");
        // }

        
        // for (int i = 1; i <= n; i++) {
        //     for(int j=1; j<=n; j++) {
        //         if(i == j || i + j == n + 1) {
        //             System.out.print("*\t");
        //         } else {
        //             System.out.print("\t");
        //         }

        //     }
        //     System.out.print("\n");
        // }

        // int oSpace = n/2;
        // int iSpace = -1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= oSpace; j++) {
        //         System.out.print("\t");    
        //     }
        //     System.out.print("*\t");
        //     for (int j = 1; j <= iSpace; j++) {
        //         System.out.print("\t");
        //     }
        //     if(i > 1 && i < n) {
        //         System.out.print("*\t");
        //     }
            
        //     if(i <= n/2) {
        //         oSpace--;
        //         iSpace += 2;
        //     } else {
        //         oSpace++;
        //         iSpace -= 2;
        //     }
            
        //     System.out.print("\n");
        // }
        
        // int a = 1;
        // for(int i = 0; i <= n; i++) {
        //     for(int j = 0;j < i; j++ ) {
        //         System.out.print(a+"\t");    
        //         a++;
        //     }
        //     System.out.print("\n");
        // }

        
        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j <= i; j++) {
        //         int upval = factori(i);
        //         int lowval = (factori(i-j)) * factori(j);
        //         int v = (upval) / (lowval);
        //         System.out.print(v + "\t");
                
        //     }
        //     System.out.print("\n");
        // }

        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(n+ " * " + i+" = "+(n*i));
        // }

        int s = n/2;
        int stars = 1;

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= s; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }

            if(i <= n/2) {
                s--;
                stars += 2;
            } else {
                s++;
                stars -= 2;
            }
            
            System.out.println("\n");
            
        }
        scn.close();
    }

    // public static int factori(int x) {
    //     int rv = 1;
    //     for(int i = x ; i >= 1; i--) {
    //         rv = rv * i;
    //     }
    //     return rv;
    // }
}
