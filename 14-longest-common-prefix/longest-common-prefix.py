class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        res=""
        for i in zip(*strs):
            if(len(set(i))==1):
                res+=i[0]
            else:
                break
        return res
        
        