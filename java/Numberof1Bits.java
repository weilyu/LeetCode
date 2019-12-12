package solutions;

/**
 * Created by lvwei on 3/8/2016.
 * https://leetcode.com/problems/number-of-1-bits/
 * Difficulty: Easy
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * <p>
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
public class Numberof1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
        }
        return count;
    }

    public void tester() {
        System.out.println(hammingWeight(1));
    }
}
