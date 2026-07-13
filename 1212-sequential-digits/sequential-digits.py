class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        s='123456789'
        arr=[]
        for i in range(len(str(low)),len(str(high))+1):
            for j in range(0,10-i):
                res=int(s[j:j+i])
                if(res>=low and res<=high):
                    arr.append(res)
        return arr
