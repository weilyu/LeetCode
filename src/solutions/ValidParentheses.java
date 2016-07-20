package solutions;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by wei on 7/20/2016.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('{', '}');
        hm.put('(', ')');
        hm.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ("([{".contains(c + ""))
                stack.push(c);
            if (")]}".contains(c + "")) {
                if (stack.size() == 0)
                    return false;
                Character curr = stack.pop();
                if (c != hm.get(curr))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}

