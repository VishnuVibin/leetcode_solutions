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
        
        return str0==str0[::-1]
        