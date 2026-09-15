class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        
        numbers1 = set(nums1) - set(nums2)
        numbers2 = set(nums2) - set(nums1)
        return [list(numbers1), list(numbers2)]

        