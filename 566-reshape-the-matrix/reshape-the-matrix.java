class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        // Check if reshape is possible
        if (m * n != r * c)
            return mat;

        int[][] ans = new int[r][c];

        for (int i = 0; i < m * n; i++) {

            // Find element in old matrix
            int oldRow = i / n;
            int oldCol = i % n;

            // Place it in new matrix
            int newRow = i / c;
            int newCol = i % c;

            ans[newRow][newCol] = mat[oldRow][oldCol];
        }

        return ans;
    }
}