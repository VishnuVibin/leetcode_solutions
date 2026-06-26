class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        arr=[]
        for i in nums:
            if not i in arr:
                arr.append(i)
            else:
                arr.remove(i)
        for i in arr:
            return i
            
        