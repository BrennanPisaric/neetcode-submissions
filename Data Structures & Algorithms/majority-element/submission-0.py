class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        numbers = {}

        for num in nums:
            count = 1
            if num in numbers:
                count+=numbers[num]
                numbers[num] = count
            numbers[num] = count

        max_value = 0
        max_number = 0
        for key, value in numbers.items():
            num = value
            if num>max_value:
                max_value = num
                max_number = key

        return max_number
        