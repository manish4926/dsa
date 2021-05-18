import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        String b = scn.nextLine();
        String c = scn.nextLine();


        System.out.println("================================");
        baseFun(a);
        baseFun(b);
        baseFun(c);
        System.out.println("================================");


        scn.close();


    }

    public static void baseFun(String x) {
        String x1[] = x.split(" ");
        System.out.printf("%-15s", x1[0]);
        System.out.printf("%03d", Integer.parseInt(x1[1]));
        System.out.println();
        // return null;
    }
}
