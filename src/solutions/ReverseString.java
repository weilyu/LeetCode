package solutions;

/**
 * Created by edwinlyu on 4/27/16.
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {
    public String reverseString(String s) {
        StringBuilder output = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            output.append(s.charAt(i));
        }
        return output.toString();
    }
}
