package solutions;

/**
 * Created by lvwei on 2/19/2016.
 * https://leetcode.com/problems/find-peak-element/
 * Difficulty: Medium
 * A peak element is an element that is greater than its neighbors.
 * Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * You may imagine that num[-1] = num[n] = -∞.
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int[] newNums = new int[nums.length + 2];
        newNums[0] = Integer.MIN_VALUE;
        newNums[newNums.length - 1] = Integer.MIN_VALUE;
        for (int i = 1; i < newNums.length - 1; i++) {
            newNums[i] = nums[i - 1];
        }
        for (int i = 1; i < newNums.length - 1; i++) {
            if (newNums[i] > newNums[i - 1] && newNums[i] > newNums[i + 1]) return i - 1;
        }
        return 0;
    }
}
