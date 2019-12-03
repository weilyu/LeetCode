class Solution:
    def repeatedStringMatch(self, A: str, B: str) -> int:
        times = math.ceil(len(B)/len(A))
        for i in range(times, times + 2):
            new_a = A * i
            if B in new_a:
                return i
        return -1
