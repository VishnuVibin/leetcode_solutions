class Solution(object):
    def leftRightDifference(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        leftsum=[]
        rightsum=[]
        arr=nums[::-1]
        temp=0
        count=0
        res=0
        val=[]
        for i in nums:
            leftsum.append(temp)
            temp+=i
        for i in arr:
            rightsum.append(count)
            count+=i
        rightsum=rightsum[::-1]
        for i in range(len(rightsum)):
            res=abs(leftsum[i]-rightsum[i])
            val.append(res)
        return val


            
        