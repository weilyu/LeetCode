package solutions;

/**
 * Created by lvwei on 2/19/2016.
 * https://leetcode.com/problems/happy-number/
 * Difficulty: Easy
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        while (n >= 1) {
            int res = 0;
            while (n >= 1) {
                res += (n % 10) * (n % 10);
                n /= 10;
            }
            n = res;
            if (n == 1) {
                return true;
            } else if (n < 10) {
                return false;
            }
        }
        return false;
    }
}
