class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k=k%len(nums)
        arr1=nums[len(nums)-k:]
        for i in range(len(nums)-k):
            arr1.append(nums[i])
        for i in range(len(nums)):
            nums[i]=arr1[i]
        return nums
        
        
        