class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        merge = sorted(nums1 + nums2)
        size = len(merge)
        if size % 2 == 0:
            median = (merge[size//2] + merge[(size//2)-1])/2
        else:
            median = merge[size//2]

        return median

from typing import List

class Solution2:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        m, n = len(nums1), len(nums2)
        merged = []
        i = j = 0

        # Merge the two arrays
        while i < m and j < n:
            if nums1[i] < nums2[j]:
                merged.append(nums1[i])
                i += 1
            else:
                merged.append(nums2[j])
                j += 1

        # Append remaining elements
        while i < m:
            merged.append(nums1[i])
            i += 1
        while j < n:
            merged.append(nums2[j])
            j += 1

        size = m + n
        if size % 2 == 0:
            return (merged[size // 2 - 1] + merged[size // 2]) / 2
        else:
            return merged[size // 2]