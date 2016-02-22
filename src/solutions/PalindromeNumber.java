package solutions;

/**
 * Created by lvwei on 2/22/2016.
 * Difficulty: Easy
 * Determine whether an integer is a palindrome.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            if (s.charAt(head) != s.charAt(tail)) return false;
            head++;
            tail--;
        }
        return true;
    }
}
