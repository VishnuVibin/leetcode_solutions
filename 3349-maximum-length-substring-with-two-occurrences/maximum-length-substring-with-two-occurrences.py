class Solution:
    def maximumLengthSubstring(self, s):
        freq = [0] * 26
        left = 0
        max_length = 0

        for right in range(len(s)):
            freq[ord(s[right]) - ord('a')] += 1

            while freq[ord(s[right]) - ord('a')] > 2:
                freq[ord(s[left]) - ord('a')] -= 1
                left += 1

            max_length = max(max_length, right - left + 1)

        return max_length