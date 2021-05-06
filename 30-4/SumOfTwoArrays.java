import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //System.out.println("Enter Array 1 Size");
        int a1 = scn.nextInt();

        //System.out.println("Enter 1 Array Elements");
        int arr1[] = new int[a1];
        for(int i = 0; i < a1; i++) {
            arr1[i] = scn.nextInt();
        }

        int a1length = arr1.length;

        //System.out.println("Enter Array 2 Size");
        int a2 = scn.nextInt();

        //System.out.println("Enter 2 Array Elements");
        int arr2[] = new int[a2];
        for (int i = 0; i < a2; i++) {
            arr2[i] = scn.nextInt();
        }

        int a2length = arr2.length;
        int reslength;
        if (a1length > a2length) {
            reslength = a1length;
        } else {
            reslength = a2length;
        }
        

        // Addidion of Array
        
        int res[] = new int[reslength];
        int p1 = a1-1, p2 = a2-1, p3= reslength-1, carry = 0;

        while(p1 >= 0 || p2 >= 0) {
            int d1 = p1 < 0 ? 0 : arr1[p1];
            int d2 = p2 < 0 ? 0 : arr2[p2];

            int sum = d1 + d2 + carry;
            int digit = sum % 10;

            carry = sum / 10;
            res[p3] = digit;
            p1--;
            p2--;
            p3--;
        }

        if(carry != 0) {
            System.out.println(carry);
        }

        for (int val : res) {
            System.out.println(val);
        }

        scn.close();    
    }
    

}
