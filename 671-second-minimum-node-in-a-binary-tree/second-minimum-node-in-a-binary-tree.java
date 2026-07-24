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
    int smallest;
    long sec_smallest;
    public int findSecondMinimumValue(TreeNode root) {
        smallest=root.val;
        sec_smallest=Long.MAX_VALUE;
        traverse(root);
        if(sec_smallest==Long.MAX_VALUE){
            return -1;
        }
        return (int)sec_smallest;
}
    public void traverse(TreeNode node){
        if(node==null){
            return;
        }
        if(node.val>smallest && node.val<sec_smallest){
            sec_smallest=node.val;
        }
        traverse(node.left);
        traverse(node.right);
    }
}
