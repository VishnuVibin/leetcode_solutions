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
import java.util.*;
class Solution {
    public int[] getCoprimes(int[] nums, int[][] edges) {
        int n = nums.length;

        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        List<Integer>[] coprime = new ArrayList[51];
        for (int i = 1; i <= 50; i++) {
            coprime[i] = new ArrayList<>();
            for (int j = 1; j <= 50; j++) {
                if (gcd(i, j) == 1) {
                    coprime[i].add(j);
                }
            }
        }

        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        List<int[]>[] path = new ArrayList[51];
        for (int i = 1; i <= 50; i++) {
            path[i] = new ArrayList<>();
        }

        dfs(0, -1, 0, nums, graph, coprime, path, ans);

        return ans;
    }

    private void dfs(int node, int parent, int depth,
                     int[] nums,
                     List<Integer>[] graph,
                     List<Integer>[] coprime,
                     List<int[]>[] path,
                     int[] ans) {

        int maxDepth = -1;
        int ancestor = -1;

        for (int val : coprime[nums[node]]) {
            if (!path[val].isEmpty()) {
                int[] last = path[val].get(path[val].size() - 1);
                if (last[0] > maxDepth) {
                    maxDepth = last[0];
                    ancestor = last[1];
                }
            }
        }

        ans[node] = ancestor;

        path[nums[node]].add(new int[]{depth, node});

        for (int nei : graph[node]) {
            if (nei != parent) {
                dfs(nei, node, depth + 1,
                    nums, graph, coprime, path, ans);
            }
        }

        path[nums[node]].remove(path[nums[node]].size() - 1);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}