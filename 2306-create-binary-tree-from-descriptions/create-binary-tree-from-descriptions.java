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
    public TreeNode createBinaryTree(int[][] descriptions) {

        HashMap<Integer, TreeNode> nodes = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();

        for (int[] desc : descriptions) {

            int parent = desc[0];
            int child = desc[1];
            int isLeft = desc[2];

            if (!nodes.containsKey(parent)) {
                nodes.put(parent, new TreeNode(parent));
            }

            if (!nodes.containsKey(child)) {
                nodes.put(child, new TreeNode(child));
            }

            if (isLeft == 1) {
                nodes.get(parent).left = nodes.get(child);
            } else {
                nodes.get(parent).right = nodes.get(child);
            }

            children.add(child);
        }

        for (int value : nodes.keySet()) {
            if (!children.contains(value)) {
                return nodes.get(value);
            }
        }

        return null;
    }
}