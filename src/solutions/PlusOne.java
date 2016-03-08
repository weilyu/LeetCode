package solutions;

import java.util.ArrayList;

/**
 * Created by lvwei on 3/8/2016.
 * https://leetcode.com/problems/plus-one/
 * Difficulty: Easy
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        digits[digits.length - 1]++;

        for (int i : digits) al.add(i);

        for (int i = al.size() - 1; i > 0; i--) {
            if (al.get(i) == 10) {
                al.set(i, 0);
                int oneLeft = al.get(i - 1);
                al.set(i - 1, oneLeft + 1);
            }
        }

        if (al.get(0) == 0) al.remove(0);

        int[] result = new int[al.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = al.get(i);
        }
        return result;

    }

    public void tester() {
        int[] data = {9, 9};
        System.out.println(plusOne(data)[0]);
    }
}
