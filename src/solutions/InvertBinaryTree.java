package solutions;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by edwinlyu on 4/19/16.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            if (!curNode.isLeaf()) {
                for (int i = 0; i < curNode.getChildCount(); i++) {
                    queue.add(curNode.getChildAt(i));
                }
            }
            invertTree(curNode);
        }
        return root;
    }
}
