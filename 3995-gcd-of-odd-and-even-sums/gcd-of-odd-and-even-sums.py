import math
class Solution:
    def gcdOfOddEvenSums(self, n: int) -> int:
        odd=[]
        even=[]
        i=1
        while(len(odd)<n):
            odd.append(i)
            i+=2
        j=0
        while(len(even)<n):
            even.append(j)
            j+=2
        
        a=len(odd)
        b=len(even)
        return math.gcd(a,b)


