class Solution {
    public int addDigits(int num) {
        int n=String.valueOf(num).length();
        int temp=0;
        if(n<2){
            temp=num;
        }
        else{
            while(num!=0){
            int rem=num%10;
            temp+=rem;
            num/=10;
        }
        }
        int len=String.valueOf(temp).length();
        if(len<2){
            return temp;
        }
        
        else{
            return addDigits(temp);
        }
    }
}