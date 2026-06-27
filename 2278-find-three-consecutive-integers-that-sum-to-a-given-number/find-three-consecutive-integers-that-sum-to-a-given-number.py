class Solution(object):
    def sumOfThree(self, num):
        """
        :type num: int
        :rtype: List[int]
        """
        if(num%3!=0):
            return []
        else:
            res=num//3
            return[res-1,res,res+1]
                

        