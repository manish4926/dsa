import java.util.*;

public class InfixEvaluationStringStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        scn.close();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch >= '0' && ch <= '9') {
                operands.push(Integer.parseInt(ch + ""));

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '(') {
                while (operators.size() > 0 &&  operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())) {
                    evaluation(operators, operands);
                }
                operators.push(ch);
            } else if(ch == ')') {
                while(operators.peek() != '(') {
                    evaluation(operators, operands);
                }
                operands.pop();
            }
        }
        while (operators.size() > 0) {
            evaluation(operators, operands);
        }

        System.out.println(operands.peek());
    }

    public static void evaluation(Stack<Character> operators, Stack<Integer> operands) {
        char op = operators.pop();
        int v2 = operands.pop(), v1 = operands.pop();
        if (op == '+')
            operands.push(v1 + v2);
        else if (op == '+')
            operands.push(v1 - v2);
        else if (op == '*')
            operands.push(v1 * v2);
        else if (op == '/')
            operands.push(v1 / v2);
    }

    public static int precedence(char op) {
        if (op == '+')
            return 1;
        if (op == '-')
            return 1;
        if (op == '*')
            return 1;
        if (op == '/')
            return 1;

        return 0;
    }
}
