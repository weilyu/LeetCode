package solutions;

/**
 * Created by lvwei on 2/18/2016.
 * https://leetcode.com/problems/product-of-array-except-self/
 * Difficulty: Medium
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product
 * of all the elements of nums except nums[i].
 */
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }
        int total = 1;
        for (int num : nums) {
            total *= num;
        }
        if (total == 0) {
            if (countZeros(nums) > 1) {
                return result;
            }
            if (countZeros(nums) == 1) {
                int zero = 0;
                int b = 1;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != 0) {
                        b *= nums[i];
                    } else {
                        zero = i;
                    }
                }
                result[zero] = b;
                return result;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = total / nums[i];
        }
        return result;
    }

    //
    public int countZeros(int[] input) {
        int count = 0;
        for (int anInput : input) {
            if (anInput == 0) {
                count++;
            }
        }
        return count;
    }
}
