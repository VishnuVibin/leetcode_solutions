class Solution:
    def deleteString(self, s: str) -> int:
        n = len(s)

        # Longest Common Prefix table
        lcp = [[0] * (n + 1) for _ in range(n + 1)]

        for i in range(n - 1, -1, -1):
            for j in range(n - 1, i, -1):
                if s[i] == s[j]:
                    lcp[i][j] = lcp[i + 1][j + 1] + 1

        dp = [1] * n

        for i in range(n - 1, -1, -1):
            for length in range(1, (n - i) // 2 + 1):
                if lcp[i][i + length] >= length:
                    dp[i] = max(dp[i], dp[i + length] + 1)

        return dp[0]