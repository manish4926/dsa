import java.util.*;

public class JavataticInitializerBlock {
    static Scanner scn = new Scanner(System.in);

    static int h = scn.nextInt();
    static int b = scn.nextInt();
    static boolean flag = true;
    static {
        try {

            if (h <= 0 || b <= 0 || h > 100 || b > 100) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = h * b;
            System.out.println(area);
        }

    }
}
