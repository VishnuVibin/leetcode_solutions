class Solution:
    def findGCD(self, nums: List[int]) -> int:
        num1=max(nums)
        num2=min(nums)
        return math.gcd(num1,num2)
        