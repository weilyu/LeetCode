package solutions;

import java.util.Arrays;

/**
 * Created by lvwei on 2/19/2016.
 * Difficulty: Medium
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p>
 * Find the minimum element.
 * <p>
 * You may assume no duplicate exists in the array.
 */
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
