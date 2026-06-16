class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        str0=""
        str1=[]
        for i in s:
            if(i.isalnum()):
                str0+=i.lower()
                str1.append(i.lower())

        left=0
        right=len(str0)-1
        while(left<right):
            temp=str1[right]
            str1[right]=str1[left]
            str1[left]=temp
            left+=1
            right-=1
        str2=""
        for i in str1:
            str2+=i
        if(str0==str2):
            return True
        else:
            return False

        