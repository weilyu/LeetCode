package solutions;

import java.util.ArrayList;

/**
 * Created by weilyu on 7/23/2016.
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution.
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : nums) al.add(i);
        for (int i = 0; i < al.size(); i++) {
            int left = target - nums[i];
            int idxLeft = al.lastIndexOf(left);
            if (idxLeft != -1 && idxLeft != i)
                return new int[]{i, idxLeft};
        }
        return new int[]{};
    }
}
