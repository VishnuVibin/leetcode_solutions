class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        nums.sort()
        arr=[]
        for i in range(nums[0],nums[len(nums)-1]):
            if(not i in nums):
                arr.append(i)
        return arr


    
        