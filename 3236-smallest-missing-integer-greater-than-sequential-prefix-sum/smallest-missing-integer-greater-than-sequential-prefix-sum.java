class Solution {
    public int missingInteger(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];

        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        int sum = dp[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum = dp[i];
            } else {
                break;
            }
        }
        boolean found = true;
        while (found) {
            found = false;
            for (int num : nums) {
                if (num == sum) {
                    found = true;
                    sum++;
                    break;
                }
            }
        }
        return sum;
    }
}