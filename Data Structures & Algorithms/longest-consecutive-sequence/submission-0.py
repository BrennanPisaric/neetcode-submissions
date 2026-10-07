class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        n = len(nums)
        hash_table = {}

        for num in nums:
            hash_table[num] = 1

        maxLCS = 0
        for num in nums:
            length = 1
            LCS = 1

            if num - 1 in hash_table:
                continue
                
            while num + length in hash_table:
                length+=1
                LCS+=1
            
            maxLCS = max(LCS, maxLCS)

        return maxLCS