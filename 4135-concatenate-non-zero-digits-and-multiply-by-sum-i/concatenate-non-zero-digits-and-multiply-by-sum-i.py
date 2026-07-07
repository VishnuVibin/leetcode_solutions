class Solution:
    def sumAndMultiply(self, n: int) -> int:
        my_str=str(n)
        arr=[]
        for i in my_str:
            if(i!='0'):
                arr.append(i)
        re_arr=list(map(int,arr))
        tot=sum(re_arr)
        if(len(arr)>0):
            res=int("".join(arr))
            return res*tot
        else:
            return 0

        