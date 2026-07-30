class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        arr_s=list(map(str,s))
        arr_t=list(map(str,t))
        for i in arr_s:
            if i in arr_t:
                arr_t.remove(i)
        return "".join(arr_t)

        