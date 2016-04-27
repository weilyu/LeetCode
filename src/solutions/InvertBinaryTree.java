package solutions;

/**
 * Created by edwinlyu on 4/27/16.
 * Total Accepted: 87158 Total Submissions: 192137 Difficulty: Easy
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
        return root;
    }
}
