package solutions;

/**
 * Created by lvwei on 2/21/2016.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Difficulty: Medium
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * <p>
 * For example,
 * Given sorted array nums = [1,1,1,2,2,3],
 * <p>
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) return nums.length;
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] != nums[i + 2]) {
                nums[count] = nums[i];
                count++;
            }
        }
        nums[count] = nums[nums.length - 2];
        nums[count + 1] = nums[nums.length - 1];
        return count + 2;
    }
}
