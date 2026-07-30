class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums=sorted(nums)
        res=0
        val=nums[0]
        for i in range(len(nums)):
            if(val+1) in nums:
                val=val+1
            else:
                res=val+1
        if(nums[0]!=0):
            return 0
        else:
            return res

        