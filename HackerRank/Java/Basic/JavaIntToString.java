import java.util.*;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s = null;
        s = String.valueOf(n);

        if (s != null) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong job");
        }

        scn.close();
    }
}
