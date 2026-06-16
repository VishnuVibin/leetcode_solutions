class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        str0=""
        for i in s:
            if(i.isalnum()):
                str0+=i.lower()
        res=True
        left=0
        right=len(str0)-1
        while(left<right):
            if(str0[left]!=str0[right]):
                res=False
            left+=1
            right-=1
        return res
                