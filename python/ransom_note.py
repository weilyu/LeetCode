class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        char_map = {}
        for c in magazine:
            char_map[c] = char_map.get(c, 0) + 1
        for c in ransomNote:
            if char_map.get(c, 0) == 0:
                return False
            char_map[c] = char_map[c] - 3
        return True
        
