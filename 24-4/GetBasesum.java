public class GetBasesum {
    
    public static int getSum(int base, int n1, int n2)
    {
        int result = 0 ; int pow = 1; int carry = 0;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int sum = d1 + d2 + carry;
            int digit = sum % base;
            carry = sum / base;
            
            result = (digit * pow) + result;

            n1 = n1 / 10;
            n2 = n2 / 10;
            pow = pow * 10;
        }
        return result;
    }

    public static int getSubtract(int base, int n1, int n2) {
        int result = 0;
        int pow = 1;
        int carry = 0;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int sum = d1 + d2 + carry;
            int digit = sum % base;
            carry = sum / base;

            result = (digit * pow) + result;

            n1 = n1 / 10;
            n2 = n2 / 10;
            pow = pow * 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int s = getSum(10, 545, 986);
        System.out.println(s);
    }

    
}
