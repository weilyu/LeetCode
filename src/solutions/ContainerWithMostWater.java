package solutions;

/**
 * Created by lvwei on 2/19/2016.
 * https://leetcode.com/problems/container-with-most-water/
 * Difficulty: Medium
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines
 * are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis
 * forms a container, such that the container contains the most water.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int head = 0;
        int tail = height.length - 1;
        while (head < tail) {
            if (height[head] >= height[tail]) {
                int container = (tail - head) * height[tail];
                if (container > max) max = container;
                tail--;
            }
            if (height[head] < height[tail]) {
                int container = (tail - head) * height[head];
                if (container > max) max = container;
                head++;
            }
        }
        return max;
    }
}
