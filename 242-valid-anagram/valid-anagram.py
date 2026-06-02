class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if(len(s)!=len(t)):
            return False
        else:
            arr1=list(s)
            arr2=list(t)
            arr1.sort()
            arr2.sort()
            return arr1==arr2
        