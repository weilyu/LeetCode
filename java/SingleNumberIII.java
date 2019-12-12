package solutions;

import java.util.Arrays;

/**
 * Created by lvwei on 2/18/2016.
 * https://leetcode.com/problems/single-number-iii/
 * Difficulty: Medium
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear
 * exactly twice. Find the two elements that appear only once.
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        if (nums.length < 3) return nums;
        Arrays.sort(nums);
        int[] n = new int[2];
        int count = 0;
        if (nums[0] != nums[1]) {
            n[0] = nums[0];
            count++;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                n[count] = nums[i];
                count++;
            }
        }
        if (count < 2) {
            n[1] = nums[nums.length - 1];
        }
        return n;
    }
}
