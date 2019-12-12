class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        prod = 1
        sum = 0
        for c in str(n):
            prod *= int(c)
            sum += int(c)
        return prod - sum
