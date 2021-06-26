import java.util.*;

public class DuplicateBracketsStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        System.out.println(isDuplicate(exp));   
        scn.close();    
    }

    public static boolean isDuplicate(String exp) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            } else if(ch == '}' || ch == ']' || ch == ')') {
                if(st.size() == 0) {
                    return false;
                } 
                if(ch == '}' && st.peek() != '{') {
                    return false;
                }
                if(ch == ')' && st.peek() != '(') {
                    return false;
                }
                if (ch == ']' && st.peek() != '[') {
                    return false;
                }
            }

        }

        if(st.size() > 0) {
            return false;
        }

        return true;
    }
    
}
