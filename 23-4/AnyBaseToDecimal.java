import java.lang.Math;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        int n = 111001;
        int b = 10;
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int i = 0;
        int sum = 0;
        while(n > 0) {
            
            int d = n % b;
            n = n / b;
            int val = d * ((int)Math.pow(2, i));
            sum = sum + val;
            i++;
            System.out.println(val);
        }
        return sum;
    }
}
