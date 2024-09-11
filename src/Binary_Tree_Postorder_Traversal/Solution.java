package Binary_Tree_Postorder_Traversal;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Definition for a binary tree node.
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> nodeData = new ArrayList<>();
    Stack<TreeNode> nodeStack = new Stack<>();
    if (root == null)
      return nodeData;
    nodeStack.push(root);
    while (!nodeStack.isEmpty()) {
      if (root.right != null)
        nodeStack.push(root.right);
      if (root.left != null)
        nodeStack.push(root.left);
      TreeNode node = nodeStack.pop();
      nodeData.add(node.val);
    }
    return nodeData;
  }
}