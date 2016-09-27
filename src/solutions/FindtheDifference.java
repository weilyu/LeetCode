package solutions;

import java.util.Arrays;

/**
 * Created by wei on 2016/09/05.
 */
public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i])
                return tArray[i];
        }
        return tArray[t.length()-1];
    }
}
