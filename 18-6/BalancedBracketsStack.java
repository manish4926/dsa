import java.util.*;

public class BalancedBracketsStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        System.out.println(isBalanced(exp)); 
        scn.close();       
    }

    public static boolean isBalanced(String exp) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == ')') {
                if (st.peek() == '(') {
                    return true;
                }

                while (st.peek() != '(') {
                    st.pop();
                }

                st.pop();
            } else {
                st.push(ch);
            }

        }

        return false;
    }
    
}
