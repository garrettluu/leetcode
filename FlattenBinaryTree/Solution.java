/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public void flatten(TreeNode root) {
    TreeNode curr = root;

    if (curr == null) {
      return;
    }

    //left subtree
    TreeNode left = root.left;

    //right subtree
    TreeNode right = root.right;

    if (left != null) {
      curr = preOrder(left, curr);
    }

    root.left = null;

    if (right != null) {
      curr = preOrder(right, curr);
    }

  }

  /**
   * Pre-order traversal of the tree starting at the root
   */
  public TreeNode preOrder(TreeNode root, TreeNode curr) {
    curr.right = new TreeNode(root.val);

    curr = curr.right;

    if (root.left != null) {
      curr = preOrder(root.left, curr);
    }

    root.left = null;

    if (root.right != null) {
      curr = preOrder(root.right, curr);
    }

    return curr;
  }
}
