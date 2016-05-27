package solutions;

/**
 * Created by lvwei on 5/27/2016.
 * https://leetcode.com/problems/power-of-three/
 * Total Accepted: 43926 Total Submissions: 118412 Difficulty: Easy
 * Given an integer, write a function to determine if it is a power of three.
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        int maxPowerOfThreeInteger = 1162261467;
        return n > 0 && maxPowerOfThreeInteger % n == 0;
    }
}
