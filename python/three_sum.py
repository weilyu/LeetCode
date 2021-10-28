class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        def twoSum(ns, target):
            res = set()
            low = 0
            high = len(ns) - 1
            while low < high:
                if ns[low] + ns[high] == target:
                    res.add((ns[low], ns[high]))
                    low += 1
                    high -= 1
                elif ns[low] + ns[high] > target:
                    high -= 1
                else:
                    low += 1
            return res
            
        
        nums.sort()
        
        result = set()
        
        for i in range(len(nums) - 2):
            twoSumRes = twoSum(nums[i+1:], 0-nums[i])
            for res in twoSumRes:
                result.add((nums[i], res[0], res[1]))
           
        
        return list(result)
        
