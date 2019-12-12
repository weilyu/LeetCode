package solutions;

/**
 * Created by wei on 2016/09/02.
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 */
public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (s.indexOf(curr) == s.lastIndexOf(curr))
                return i;
        }
        return -1;
    }
}
