package solutions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lvwei on 5/24/2016.
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * Total Accepted: 3381 Total Submissions: 7995 Difficulty: Easy
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 */
public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result = new ArrayList<>();
        int pt1 = 0;
        int pt2 = 0;
        while (pt1 < nums1.length && pt2 < nums2.length) {
            if (nums1[pt1] == nums2[pt2]) {
                result.add(nums1[pt1]);
                pt1++;
                pt2++;
            } else if (nums1[pt1] < nums2[pt2])
                pt1++;
            else pt2++;
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
