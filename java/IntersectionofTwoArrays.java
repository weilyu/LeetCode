package solutions;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by lvwei on 5/23/2016.
 */
public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;
        HashSet<Integer> num1HS = convertToHS(nums1);
        HashSet<Integer> num2HS = convertToHS(nums2);
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : num1HS) {
            if (num2HS.contains(i)) result.add(i);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public HashSet<Integer> convertToHS(int[] num) {
        HashSet<Integer> result = new HashSet<>();
        for (int n : num) {
            if (!result.contains(n)) result.add(n);
        }
        return result;
    }
}
