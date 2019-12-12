package solutions;

import java.util.Arrays;

/**
 * Created by lvwei on 2/19/2016.
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 * Difficulty: Hard
 * <p>
 * <p>
 * Follow up for "Find Minimum in Rotated Sorted Array":
 * What if duplicates are allowed?
 * <p>
 * Would this affect the run-time complexity? How and why?
 * <p>
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 */
public class FindMinimuminRotatedSortedArrayII {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
