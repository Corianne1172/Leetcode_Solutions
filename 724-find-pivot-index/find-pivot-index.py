class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        pivot_index = 0
        left_sum = 0
        right_sum = sum(nums[1:len(nums)])

        for i in range (1,len(nums)):
            if left_sum == right_sum:
                return pivot_index
            pivot_index = i
            left_sum += nums[i-1]
            right_sum -= nums[i]

        right_sum = 0
        if left_sum == 0:
            return len(nums) - 1
        else:
            return -1