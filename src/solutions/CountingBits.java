package solutions;

/**
 * Created by edwinlyu on 9/27/16.
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] output = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            output[i] = countOne(i);
        }
        return output;
    }

    private int countOne(int i) {
        int numOne = 0;
        String binary = Integer.toBinaryString(i);
        for (char c : binary.toCharArray())
            if (c == '1')
                numOne++;
        return numOne;
    }
}
