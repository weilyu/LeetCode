class Solution:
    def arrangeCoins(self, n: int) -> int:
        total = 0
        for i in range(1, sys.maxsize):
            total += i
            if total > n:
                return i - 1
