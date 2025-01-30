package Count_Complete_Tree_Nodes;

// Approach 1: Recursion
//class Solution {
//  public int countNodes(TreeNode root) {
//    if (root == null) {
//      return 0;
//    }
//    return 1 + countNodes(root.left) + countNodes(root.right);
//  }
//}

import java.util.Stack;

// Approach 2: Iterative
class Solution {
  public int countNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftHeight = getLeftHeight(root);
    int rightHeight = getRightHeight(root);
    if (leftHeight == rightHeight) {
      return (1 << leftHeight) - 1; // 2^h - 1
    }
    return 1 + countNodes(root.left) + countNodes(root.right);
  }

  private int getRightHeight(TreeNode root) {
    int height = 0;
    while (root != null) {
      height++;
      root = root.right;
    }
    return height;
  }

  private int getLeftHeight(TreeNode root) {
    int height = 0;
    while (root != null) {
      height++;
      root = root.left;
    }
    return height;
  }
}