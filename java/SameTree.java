package solutions;

/**
 * Created by edwinlyu on 4/27/16.
 * Given two binary trees, write a function to check if they are equal or not.
 * <p>
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * <p>
 * Subscribe to see which companies asked this question
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null || !(p == null || q == null) && p.val == q.val && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
