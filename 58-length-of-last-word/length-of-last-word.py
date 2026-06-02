class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        arr=s.split(" ")
        i=len(arr)-1
        while i>=0 and arr[i]=="":
            i-=1

        temp=len(arr[i])
        return temp