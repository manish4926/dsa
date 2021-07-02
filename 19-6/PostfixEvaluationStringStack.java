import java.util.*;

public class PostfixEvaluationStringStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        scn.close();

        Stack<Integer> eval = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch >= '0' && ch <= '9') {
                eval.push(Integer.parseInt(ch + ""));
                infix.push(ch + "");
                prefix.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // Infix
                String inv2 = infix.pop(), inv1 = infix.pop();
                infix.push("(" + inv1 + ch + inv2 + ")");

                // Prefix
                String prv2 = prefix.pop(), prev1 = prefix.pop();
                prefix.push(ch + prev1 + prv2);

                // eval
                int v2 = eval.pop(), v1 = eval.pop();
                if (ch == '+')
                    eval.push(v1 + v2);
                else if (ch == '-')
                    eval.push(v1 - v2);
                else if (ch == '*')
                    eval.push(v1 * v2);
                else if (ch == '/')
                    eval.push(v1 / v2);
            }
        }

        System.out.println(eval.peek() + "\n" + infix.peek() + "\n" + prefix.peek());
    }
}
