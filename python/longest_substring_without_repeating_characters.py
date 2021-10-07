class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left = right = 0
        chars = set()
        longest = 0
        while right < len(s):
            if s[right] not in chars:
                chars.add(s[right])
                right += 1
            else:
                if len(chars) > longest:
                    longest = len(chars)
                chars.remove(s[left])
                left += 1
        return max(longest, len(chars))
        
