class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        arr=nums1+nums2
        arr.sort()
        temp=len(arr)//2
        if len(arr)%2==0:
            return (arr[temp-1]+arr[temp])/2.0
        else:
            return arr[temp]
        