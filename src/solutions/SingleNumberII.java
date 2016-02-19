package solutions;

import java.util.Arrays;

/**
 * Created by lvwei on 2/19/2016.
 * https://leetcode.com/problems/single-number-ii/
 * Difficulty: Medium
 * Given an array of integers, every element appears three times except for one. Find that single one.
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) return nums[0];
        for (int i = 0; i < nums.length - 1; i += 3) {
            if (nums[i] != nums[i + 1]) return nums[i];
        }
        return nums[nums.length - 1];
    }
}
