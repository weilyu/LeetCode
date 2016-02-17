package solutions;

import java.util.Arrays;

/**
 * Created by lvwei on 2/17/2016.
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 * Difficulty: Easy
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        String s2 = new String(s1);
        String t2 = new String(t1);
        if (s2.equals(t2)) {
            return true;
        } else {
            return false;
        }
    }


}
