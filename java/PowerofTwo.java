package solutions;

/**
 * Created by lvwei on 2/19/2016.
 * https://leetcode.com/problems/power-of-two/
 * Difficulty: Easy
 * Given an integer, write a function to determine if it is a power of two.
 */
public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n > 1) {
            if (n % 2 != 0) return false;
            n = n >>> 1;
        }
        return true;
    }
}
