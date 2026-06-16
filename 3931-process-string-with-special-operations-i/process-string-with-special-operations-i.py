class Solution(object):
    def processStr(self, s):
        """
        :type s: str
        :rtype: str
        """
        str=""
        for i in s:
            if(ord(i)>=65 and ord(i)<=122):
                str+=i
            elif(i=='#'):
                str=str*2
            elif(i=='%'):
                str=str[::-1]
            else:
                str=str[:-1]
        return str


        