package solutions;

import java.util.*;

/**
 * Created by lvwei on 5/25/2016.
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * Total Accepted: 122612 Total Submissions: 305299 Difficulty: Medium
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 * return [1,2,3].
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> answer = new ArrayList<>();
        if (root == null) return answer;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (stack.size() > 0) {
            TreeNode curr = stack.pop();
            answer.add(curr.val);
            if (curr.right != null)
                stack.add(curr.right);
            if (curr.left != null)
                stack.add(curr.left);
        }
        return answer;
    }
}
