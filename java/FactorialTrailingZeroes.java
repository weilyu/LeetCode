package solutions;

/**
 * Created by lvwei on 2/22/2016.
 * https://leetcode.com/problems/factorial-trailing-zeroes/
 * Difficulty: Easy
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p>
 * Note: Your solution should be in logarithmic time complexity.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 1) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
