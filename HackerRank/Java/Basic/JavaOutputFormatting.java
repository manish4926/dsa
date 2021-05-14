import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        String b = scn.nextLine();
        String c = scn.nextLine();

        String a1[] = a.split(" ");

        System.out.println(a1[0].length());


        scn.close();


    }
}
