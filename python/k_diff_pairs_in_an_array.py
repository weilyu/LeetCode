class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        existing_pairs = set()
        nums = sorted(nums)
        while len(nums) > 0:
            n = nums.pop(0)
            if n + k in nums:
                existing_pairs.add((n, n + k))
        return len(existing_pairs)
