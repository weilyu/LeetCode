package solutions;

/**
 * Created by lvwei on 2/18/2016.
 */
public class Numberof1Bits {
    public int hammingWeight(int n) {
        String s = String.valueOf(n);
        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count1++;
            }
        }
        return count1;
    }
}

