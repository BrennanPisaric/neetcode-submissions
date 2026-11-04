class Solution:
    def maxArea(self, heights: List[int]) -> int:
        
        n = len(heights)
        l, r = 0, n - 1
        maxArea = 0

        while l < r:

            width = r - l
            height = min(heights[l], heights[r])
            maxArea = max(maxArea, width * height)

            if heights[l] > heights[r]:
                r -= 1
            else:
                l += 1

        return maxArea