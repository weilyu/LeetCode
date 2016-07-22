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
        return Integer.reverse(n);
    }
}
