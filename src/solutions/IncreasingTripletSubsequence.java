package solutions;

/**
 * Created by lvwei on 2/19/2016.
 * https://leetcode.com/problems/increasing-triplet-subsequence/
 * Difficulty: Medium
 * Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.
 */
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] > nums[i]) {
                    for (int k = j; k < nums.length; k++) {
                        if (nums[k] > nums[j]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
