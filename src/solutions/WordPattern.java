package solutions;

import java.util.HashMap;

/**
 * Created by lvwei on 3/8/2016.
 * https://leetcode.com/problems/word-pattern/
 * Difficulty: Easy
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] array = str.split(" ");

        if (pattern.length() != array.length) return false;

        HashMap<Character, String> myMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char curChar = pattern.charAt(i);
            String value = array[i];
            if (!myMap.containsKey(curChar) && !myMap.containsValue(value)) myMap.put(curChar, value);
        }

        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String value = myMap.get(key);
            if (!array[i].equals(value)) return false;
        }
        return true;
    }

    public void test() {
        System.out.println(wordPattern("abba", "dog cat cat cat"));
    }
}
