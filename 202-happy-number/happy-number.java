class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> st=new HashSet<>();
        while(!st.contains(n)){
            st.add(n);
            n=check(n);
            if(n==1){
                return true;
            }
        } 
        return false;
    }
    public int check(int n){
        int temp=0;
        while(n>0){
            int dig=n%10;
            temp+=dig*dig;
            n=n/10;
        }
        return temp;
    }
}