package solutions;

/**
 * Created by lvwei on 2/19/2016.
 * https://leetcode.com/problems/ugly-number/
 * Difficulty: Easy
 * Write a program to check whether a given number is an ugly number.
 * <p>
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * <p>
 * Note that 1 is typically treated as an ugly number.
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        while (Math.abs(num) > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else break;
        }
        while (Math.abs(num) > 1) {
            if (num % 3 == 0) {
                num /= 3;
            } else break;
        }
        while (Math.abs(num) > 1) {
            if (num % 5 == 0) {
                num /= 5;
            } else break;
        }
        return num == 1;
    }
}
