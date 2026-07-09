class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if (Math.abs(target) > sum || (sum + target) % 2 != 0)
            return 0;
            
        int pos=(sum+target)/2;
        int[][] dp=new int[n+1][pos+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=pos;j++){
                dp[i][j]=dp[i-1][j];
                if(nums[i-1]<=j){
                    dp[i][j]+=dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[n][pos];
    }
}