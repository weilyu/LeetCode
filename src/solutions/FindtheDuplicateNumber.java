package solutions;

/**
 * Created by lvwei on 2/19/2016.
 * https://leetcode.com/problems/find-the-duplicate-number/
 * Difficulty: Hard
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 * Note:
 * <p>
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        //use 1 - n to compare with the array
        for (int i = 0; i < len - 1; i++) {
            //actual number to compare
            int actual = i + 1;
            for (int j = 0; j < nums.length; j++) {
                if (i + 1 == nums[j]) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (i + 1 == nums[k]) return nums[k];
                    }
                }
            }
        }
        return 0;
    }
}
