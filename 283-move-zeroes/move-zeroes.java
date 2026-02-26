class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0;
        int[]arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[temp]=nums[i];
                temp++;
            }}
        for(int j=0;j<nums.length;j++){
                nums[j]=arr[j];
            } }}

