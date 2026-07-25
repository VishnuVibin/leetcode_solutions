class Solution:
    def maxProduct(self, n: int) -> int:
        max_num=0
        my_str=str(n)
        arr=[]
        for i in my_str:
            arr.append(int(i))
        first=max(arr)
        arr.remove(max(arr))
        second=max(arr)
        return first*second      