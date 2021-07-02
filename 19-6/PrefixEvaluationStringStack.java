import java.util.*;

public class PrefixEvaluationStringStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        scn.close();

        Stack<Integer> eval = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch >= '0' && ch <= '9') {
                eval.push(Integer.parseInt(ch + ""));
                infix.push(ch + "");
                postfix.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // Infix
                String inv1 = infix.pop(), inv2 = infix.pop();
                infix.push("(" + inv1 + ch + inv2 + ")");

                // PostFix
                String pst1 = postfix.pop(), pst2 = postfix.pop();
                postfix.push(pst1 + pst2 + ch);

                // eval
                int v1 = eval.pop(), v2 = eval.pop();
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

        System.out.println(eval.peek() + "\n" + infix.peek() + "\n" + postfix.peek());
    }
}
