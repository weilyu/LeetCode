package solutions;

/**
 * Created by lvwei on 2/22/2016.
 * Difficulty: Easy
 * https://leetcode.com/problems/length-of-last-word/
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] group = s.split(" ");
        int len = group.length;
        if (len == 0) return 0;
        return group[len - 1].length();
    }
}
