package solutions;

/**
 * Created by lvwei on 2/17/2016.
 * https://leetcode.com/problems/move-zeroes/
 * Difficulty: Easy
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * You must do this in-place without making a copy of the array.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int k = 1;
        while (k < nums.length) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 0) {
                    nums[i] = nums[i + 1];
                    nums[i + 1] = 0;
                }
            }
            k++;
        }
    }
}
