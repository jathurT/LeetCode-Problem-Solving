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

// left -> right -> root
class Solution {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> nodeData = new ArrayList<>();
    if (root == null)
      return nodeData;

    Stack<TreeNode> nodeStack = new Stack<>();
    Stack<TreeNode> outputStack = new Stack<>();

    nodeStack.push(root);

    while (!nodeStack.isEmpty()) {
      TreeNode node = nodeStack.pop();
      outputStack.push(node);

      if (node.left != null)
        nodeStack.push(node.left);
      if (node.right != null)
        nodeStack.push(node.right);
    }

    while (!outputStack.isEmpty()) {
      nodeData.add(outputStack.pop().val);
    }

    return nodeData;
  }
}
