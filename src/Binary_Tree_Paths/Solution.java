package Binary_Tree_Paths;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> binaryTreePaths(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }
    List<String> result = new ArrayList<>();
    dfs(root, "", result);
    return result;
  }

  private void dfs(TreeNode root, String s, List<String> result) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      result.add(s + root.val);
      return;
    }
    dfs(root.left, s + root.val + "->", result);
    dfs(root.right, s + root.val + "->", result);
  }
}