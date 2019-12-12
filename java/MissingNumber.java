package solutions;

import java.util.Arrays;

/**
 * Created by lvwei on 2/18/2016.
 * https://leetcode.com/problems/missing-number/
 * Difficulty: Medium
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums[nums.length - 1] + 1;

    }
}
