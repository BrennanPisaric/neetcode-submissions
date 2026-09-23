class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:

        n = len(nums)
        ans = [0]*2*n
        
        for i in range (n):
            ans[i-1] = nums[i-1]

        for j in range (n):
            ans[j+n-1] = nums [j-1]

        return ans

        