class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        merge = sorted(nums1 + nums2)
        size = len(merge)
        if size % 2 == 0:
            median = (merge[size//2] + merge[(size//2)-1])/2
        else:
            median = merge[size//2]

        return median