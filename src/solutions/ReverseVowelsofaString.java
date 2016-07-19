package solutions;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by wei on 7/19/2016.
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * <p>
 * Example 1:
 * Given s = "hello", return "holle".
 * <p>
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * <p>
 * Note:
 * The vowels does not include the letter "y".
 */
public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".contains(c + ""))
                stack.add(c);
        }
        for (int i = 0; i < sb.length(); i++) {
            if ("aeiouAEIOU".contains(sb.charAt(i) + ""))
                sb.setCharAt(i, stack.pop());
        }
        return sb.toString();
    }
}
