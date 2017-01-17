package solutions;


/**
 * Created by weilyu on 17/01/2017.
 * https://leetcode.com/problems/hamming-distance/
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int total = 0;
        while (x >= 1 || y >= 1) {
            String sx = Integer.toBinaryString(x);
            String sy = Integer.toBinaryString(y);
            if (sx.charAt(sx.length() - 1) != sy.charAt(sy.length() - 1)) {
                total++;
            }
            x = x >> 1;
            y = y >> 1;
        }
        return total;
    }

}
