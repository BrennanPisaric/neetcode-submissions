class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store number -> its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse array once
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // The number we need to find

            // If complement is already in the map, we found the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store current number and its index
            map.put(nums[i], i);
        }

        // If no pair found (per problem statement, this shouldn’t happen)
        return new int[] {};
    }
}
