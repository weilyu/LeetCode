package solutions;

/**
 * Created by lvwei on 2/17/2016
 * URL: https://leetcode.com/problems/shortest-palindrome/
 * Given a string S, you are allowed to convert it to a palindrome by adding characters in front of it. Find and return the shortest palindrome you can find by performing this transformation. .
 * For example:
 * Given "aacecaaa", return "aaacecaaa".
 * Given "abcd", return "dcbabcd".
 */


public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();

        //if the length is 1,or s is palindrome, return s
        final int len = s.length();
        if (len == 1 || isPalindrome(sb)) {
            return s;
        }

        StringBuilder addToEnd = new StringBuilder(s);
        for (int i = 0; i < len; i++) {
            addToEnd = addToEnd.insert(len, s.charAt(i));
            if (isPalindrome(addToEnd)) {
                break;
            }
        }

        StringBuilder addToFront = new StringBuilder(s);
        for (int i = 0; i < len; i++) {
            addToFront = addToFront.insert(i, reversed.charAt(i));
            if (isPalindrome(addToFront)) {
                break;
            }
        }

        if (addToEnd.length() < addToFront.length()) {
            return addToEnd.toString();
        } else {
            return addToFront.toString();
        }

    }

    //return true if the string input is a palindrome
    public boolean isPalindrome(StringBuilder input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
