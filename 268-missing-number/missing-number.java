class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int output=n*(n+1)/2;
        int act_sum=0;
        for(int i:nums){
            act_sum+=i;
        }
        return output-act_sum;
    }
}