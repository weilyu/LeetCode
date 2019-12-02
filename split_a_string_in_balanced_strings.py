class Solution:
    def balancedStringSplit(self, s: str) -> int:
        total = 0
        count_l = 0
        count_r = 0
        for c in s:
            if c == 'L':
                count_l += 1
            if c == 'R':
                count_r += 1
            if count_l == count_r:
                total += 1
        return total
