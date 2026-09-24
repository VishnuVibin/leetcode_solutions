class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows==1 or numRows>=len(s):
            return s
        idx,d=0,1
        rows=[[] for _ in range(numRows)]
        for i in s:
            rows[idx].append(i)
            if(idx==0):
                d=1
            elif idx==numRows-1:
                d=-1
            idx+=d
        for j in range(numRows):
            rows[j]="".join(rows[j])
        return "".join(rows)
        