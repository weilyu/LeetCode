package solutions;

/**
 * Created by edwinlyu on 4/27/16.
 * Total Accepted: 140722 Total Submissions: 294341 Difficulty: Easy
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Subscribe to see which companies asked this question
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int maxDepthLeft = 1 + maxDepth(root.left);
        int maxDepthRight = 1 + maxDepth(root.right);
        return Math.max(maxDepthLeft, maxDepthRight);
    }
}
