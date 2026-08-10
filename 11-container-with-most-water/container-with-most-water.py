class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = float('-inf')
        first_line = 0
        second_line = len(height) - 1

        while(first_line < second_line):
            current_area = (second_line - first_line) * min(height[first_line], height[second_line])
            max_area = max(max_area, current_area)
            
            if height[first_line] < height[second_line]:
                first_line += 1
            else:
                second_line -= 1
        return max_area
        