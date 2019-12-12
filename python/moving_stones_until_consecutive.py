class Solution:
    def numMovesStones(self, a: int, b: int, c: int) -> List[int]:
        return [self.get_min(a, b, c), self.get_max(a, b, c)]
        
    def get_max(self, a, b, c):
        return max(a, b, c) - min(a, b, c) - 2
    
    def get_min(self, a, b, c):
        a, b, c = sorted([a, b, c])
        min_room = min(c - b - 1, b - a - 1)
        max_room = max(c - b - 1, b - a - 1)
        if min_room == 0 and max_room == 0:
            return 0
        if min_room > 1 and max_room > 1:
            return 2
        return 1
        
