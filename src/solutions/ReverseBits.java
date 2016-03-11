package solutions;

/**
 * Created by lvwei on 3/11/2016.
 * https://leetcode.com/problems/reverse-bits/
 * Difficulty: Easy
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
 * return 964176192 (represented in binary as 00111001011110000010100101000000).
 */
public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32 - s.length(); i++) {
            sb.append('0');
        }
        sb.append(s);
        sb.reverse();
        return Integer.valueOf(sb.toString(),2);
    }
}
