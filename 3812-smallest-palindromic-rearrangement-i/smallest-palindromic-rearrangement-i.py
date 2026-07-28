class Solution:
    def smallestPalindrome(self, s: str) -> str:
        left=""
        middle=""
        
        new_set=set(s)
        my_str="".join(new_set)
        count=0
        for i in my_str:
            val=s.count(i)
            left+=i*(val//2)
            if(val%2!=0):
                middle=i
        left="".join(sorted(left))
        right=left[::-1]
        return left+middle+right
        


        
        