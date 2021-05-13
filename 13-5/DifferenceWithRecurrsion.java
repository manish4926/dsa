import java.util.Scanner;

class DifferenceWithRecurrsion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);   
        int n  = scn.nextInt();
        DecreaseVal(n);

        scn.close();    
    }

    public static void DecreaseVal(int val) {
        if(val == 0) {
            return;
        }
        
        System.out.println(val);
        DecreaseVal(val-1);
        

    }
    
}
