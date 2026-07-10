class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        String max_str=s.substring(0,1);
        int max_length=1;
        for(int i=0;i<s.length();i++){
            for(int j=i+max_length;j<=s.length();j++){
                if(j-i>max_length && isPallindrome(s.substring(i,j))){
                    max_length=j-i;
                    max_str=s.substring(i,j);
                }
            }
        }
        return max_str;
    }
        public boolean isPallindrome(String str){
            int left=0;
            int right=str.length()-1;
            while(left<right){
                if(str.charAt(left)!=str.charAt(right)){
                    return false;
                }
                left++;
                right--;

            }
            return true;
        }
    }