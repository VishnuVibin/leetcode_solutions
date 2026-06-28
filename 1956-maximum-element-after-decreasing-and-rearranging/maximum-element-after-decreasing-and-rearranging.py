class Solution(object):
    def maximumElementAfterDecrementingAndRearranging(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        res=0
        arr.sort()
        arr[0]=1
        for i in range(1,len(arr)):
            arr[i]=min(arr[i],arr[i-1]+1)
        return arr[-1]
        