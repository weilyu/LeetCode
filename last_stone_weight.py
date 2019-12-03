class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones = sorted(stones)
        if len(stones) == 1:
            return stones[0]
        last = abs(stones[-1] - stones[-2])
        stones = stones[:len(stones) - 1]
        stones[-1] = last
        return self.lastStoneWeight(stones)
        
