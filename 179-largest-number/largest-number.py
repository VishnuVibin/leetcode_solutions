class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        arr = []
        for num in nums:
            arr.append(str(num))
        n = len(arr)
        for i in range(n):
            for j in range(0, n - i - 1):
                if arr[j] + arr[j + 1] < arr[j + 1] + arr[j]:
                    arr[j], arr[j + 1] = arr[j + 1], arr[j]
        ans = ""
        for s in arr:
            ans += s
        if ans[0] == "0":
            return "0"

        return ans