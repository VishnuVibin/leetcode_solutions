class Solution {

    private Long[][][][][] memo;
    private char[] digits;

    private long[] dfs(int pos, int prev2, int prev1, int started, int tight) {
        if (pos == digits.length) {
            return new long[]{1, 0};
        }

        if (memo[pos][prev2 + 1][prev1 + 1][started][tight] != null) {
            long ways = memo[pos][prev2 + 1][prev1 + 1][started][tight];
            long wav = memo2[pos][prev2 + 1][prev1 + 1][started][tight];
            return new long[]{ways, wav};
        }

        int limit = tight == 1 ? digits[pos] - '0' : 9;

        long totalWays = 0;
        long totalWav = 0;

        for (int d = 0; d <= limit; d++) {
            int ntight = (tight == 1 && d == limit) ? 1 : 0;

            if (started == 0 && d == 0) {
                long[] nxt = dfs(pos + 1, -1, -1, 0, ntight);
                totalWays += nxt[0];
                totalWav += nxt[1];
            } else {
                int add = 0;

                if (started == 1 && prev2 != -1) {
                    if ((prev1 > prev2 && prev1 > d) ||
                        (prev1 < prev2 && prev1 < d)) {
                        add = 1;
                    }
                }

                long[] nxt = dfs(pos + 1, prev1, d, 1, ntight);

                totalWays += nxt[0];
                totalWav += nxt[1] + nxt[0] * add;
            }
        }

        memo[pos][prev2 + 1][prev1 + 1][started][tight] = totalWays;
        memo2[pos][prev2 + 1][prev1 + 1][started][tight] = totalWav;

        return new long[]{totalWays, totalWav};
    }

    private Long[][][][][] memo2;

    private long solve(long n) {
        if (n <= 0) return 0;

        digits = String.valueOf(n).toCharArray();

        int len = digits.length;

        memo = new Long[len + 1][11][11][2][2];
        memo2 = new Long[len + 1][11][11][2][2];

        return dfs(0, -1, -1, 0, 1)[1];
    }

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }
}