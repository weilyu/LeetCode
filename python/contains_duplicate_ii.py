

#
# @lc app=leetcode id=219 lang=python3
#
# [219] Contains Duplicate II
#

# @lc code=start


class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        temp_set = set()
        for i in range(len(nums)):
            if i > k:
                temp_set.remove(nums[i - k - 1])
            if nums[i] in temp_set:
                return True
            temp_set.add(nums[i])
        return False
# @lc code=end
