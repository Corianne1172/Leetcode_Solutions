class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = 0
        non_zero = 0
        
        while i < len(nums):
            if nums[i] != 0:
                nums[non_zero] = nums[i]
                non_zero+=1
            i+=1

        while non_zero < len(nums):
            nums[non_zero] = 0
            non_zero+=1

        
        