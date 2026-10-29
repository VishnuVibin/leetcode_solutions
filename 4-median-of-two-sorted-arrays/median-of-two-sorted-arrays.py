class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        arr=nums1+nums2
        arr.sort()
        temp=0
        if len(arr)%2!=0:
            temp=len(arr)//2
            return (arr[temp])
        else:
            temp=len(arr)//2
            return (arr[temp-1]+arr[temp])/2
            