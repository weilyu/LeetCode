# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def hasPathSum(self, root: TreeNode, sum: int) -> bool:
        if root is None:
            return False
        queue = [root]
        while len(queue) > 0:
            node = queue.pop(0)
            if node.left is None and node.right is None and node.val == sum:
                return True
            if node.left is not None:
                node.left.val += node.val
                queue.append(node.left)
            if node.right is not None:
                node.right.val += node.val
                queue.append(node.right)
        return False

        
        
