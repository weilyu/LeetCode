package solutions;

/**
 * Created by lvwei on 2/18/2016.
 * https://leetcode.com/problems/add-digits/
 * Difficulty: Easy
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 */
public class AddDigits {
    public int addDigits(int num) {
        while (num > 9) {
            num = addOneTime(num);
        }
        return num;
    }

    public int addOneTime(int input) {
        int result = 0;
        while (input > 0) {
            result += input % 10;
            input /= 10;
        }
        return result;
    }

}
