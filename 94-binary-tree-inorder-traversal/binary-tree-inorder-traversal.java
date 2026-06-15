/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<Integer> res;

    public List<Integer> inorderTraversal(TreeNode root) {
        res = new ArrayList<>();

        recur(root);

        return res;
    }

    private void recur(TreeNode node) {
        if(node == null)
            return ;

        recur(node.left);
        res.add(node.val);
        recur(node.right);
    }
}