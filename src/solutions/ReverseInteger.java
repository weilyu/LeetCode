package solutions;

/**
 * Created by lvwei on 3/10/2016.
 * https://leetcode.com/problems/reverse-integer/
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class ReverseInteger {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        String xString = String.valueOf(x);
        for (int i = xString.length() - 1; i >= 0; i--) {
            sb.append(xString.charAt(i));
        }
        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, '-');
        }
        return Integer.valueOf(sb.toString());
    }
}
