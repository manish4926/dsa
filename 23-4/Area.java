import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println(add(12 , 15));
        System.out.println(isEven(15));
        System.out.println("Area of Square is :"+area(15) );
        System.out.println("Area of Rectangle is :" + area(15,18));
        scn.close();
    }

    public static int add(int v1, int v2) {
        return v1 + v2;
    }

    public static boolean isEven(int v1){
        return(v1%2==0);
    }
    
    public static int area(int side) {
        return side * side;
    }

    public static int area(int len, int bre) {
        return len * bre;
    }
}


