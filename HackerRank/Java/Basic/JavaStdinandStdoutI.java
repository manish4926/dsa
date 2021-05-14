import java.util.Scanner;

public class JavaStdinandStdoutI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();

        scanner.close();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
