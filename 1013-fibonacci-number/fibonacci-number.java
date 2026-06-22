class Solution {
    public int fib(int n) {
        int val1=1;
        int val2=0;
        for(int i=1;i<=n;i++){
            int curr=val1+val2;
            val1=val2;
            val2=curr;
        }
        return val2;
    }
}