package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wei on 7/19/2016.
 * https://leetcode.com/problems/binary-tree-paths/
 * Given a binary tree, return all root-to-leaf paths.
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null)
            return result;
        dfs(root, new StringBuilder(), result);
        return result;
    }

    private void dfs(TreeNode root, StringBuilder sb, List<String> result) {
        if (root.left == null && root.right == null) {
            sb.append(root.val);
            result.add(sb.toString());
            return;
        }

        sb.append(root.val);
        sb.append("->");

        if (root.left != null) {
            dfs(root.left, new StringBuilder(sb), result);
        }

        if (root.right != null) {
            dfs(root.right, new StringBuilder(sb), result);
        }
    }
}
