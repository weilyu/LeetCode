#
# @lc app=leetcode id=4 lang=python3
#
# [4] Median of Two Sorted Arrays
#

# @lc code=start


class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        cb = []
        while len(nums1) > 0 or len(nums2) > 0:
            if len(nums1) == 0:
                cb.append(nums2.pop(0))
            elif len(nums2) == 0:
                cb.append(nums1.pop(0))
            elif nums1[0] < nums2[0]:
                cb.append(nums1.pop(0))
            else:
                cb.append(nums2.pop(0))
        if len(cb) % 2 == 0:
            return (cb[int(len(cb) / 2) - 1] + cb[int(len(cb) / 2)]) / 2
        return cb[int(len(cb) / 2)]
# @lc code=end
