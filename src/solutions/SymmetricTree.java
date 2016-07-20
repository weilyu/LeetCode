package solutions;

/**
 * Created by wei on 7/20/2016.
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null & root.right == null) return true;
        if ((root.left == null && root.right != null)
                || (root.left != null && root.right == null)) return false;
        if (root.left.val != root.right.val) return false;
        return check(root.left.left, root.right.right) && check(root.left.right, root.right.left);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if ((left == null && right != null)
                || (left != null && right == null)) return false;
        if (left.val != right.val) return false;
        return check(left.left, right.right) && check(left.right, right.left);
    }
}
