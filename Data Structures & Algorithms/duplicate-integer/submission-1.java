class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Use a set to store seen numbers
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            // If number already seen, it's a duplicate
            if (seen.contains(num)) {
                return true;
            }
            // Otherwise, add it to the set
            seen.add(num);
        }

        // If loop finishes, no duplicates found
        return false;
    }
}