package solutions;

import java.util.Arrays;

/**
 * Created by lvwei on 2/18/2016.
 * https://leetcode.com/problems/single-number/
 * Difficulty: Medium
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result += nums[i];
            } else {
                result -= nums[i];
            }
        }
        return result;
    }
}
