class Solution {
    public int findGCD(int[] nums) {
        int num1=Integer.MIN_VALUE;;
        int num2=Integer.MAX_VALUE;
        for(int i:nums){
            num1=Math.max(num1,i);
            num2=Math.min(num2,i);
        }
        while(num2!=0){
            int rem=num1%num2;
            num1=num2;
            num2=rem;
        }
        return num1;
    }
}