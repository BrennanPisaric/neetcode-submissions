class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        n = len(nums)

        temp = set()

        for i in range (n):
            if nums[i] in temp:
                return True

            temp.add(nums[i])

        return False
        