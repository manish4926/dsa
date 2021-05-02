import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int a1 = scn.nextInt();

        System.out.println("Enter 1 Array Elements");
        int arr1[] = new int[a1];
        for(int i = 0; i < a1; i++) {
            arr1[i] = scn.nextInt();
        }

        int a1length = arr1.length;

        int a2 = scn.nextInt();

        System.out.println("Enter 1 Array Elements");
        int arr2[] = new int[a2];
        for (int i = 0; i < a2; i++) {
            arr2[i] = scn.nextInt();
        }

        int a2length = arr2.length;
        
        if (a1length > a2length) {
            reslength = arr1;
        } else {
            reslength = arr2;
        }
        

        // Addidion of Array
        
        int res[] = new int[reslength];
        for (int i = 0; i < reslength; i++) {
            //arr2[i] = scn.nextInt();
        }

        scn.close();    
    }
    

}
