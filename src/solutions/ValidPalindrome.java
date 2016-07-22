package solutions;

/**
 * Created by wei on 7/22/2016.
 * https://leetcode.com/problems/valid-palindrome/
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for (char c : s.toCharArray())
            if (Character.isLetter(c) || Character.isDigit(c))
                sb.append(c);
        String ori = sb.toString();
        String rev = sb.reverse().toString();
        return ori.equals(rev);
    }
}
