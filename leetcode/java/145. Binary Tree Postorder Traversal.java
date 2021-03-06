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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        process(root, ret);
        
        return ret;
    }
    
    public void process(TreeNode node, List<Integer> list) {
        if(node == null) {
            return;
        }    
        process(node.left, list);
        process(node.right, list);
        list.add(node.val);
    }
}