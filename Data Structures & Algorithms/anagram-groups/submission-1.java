class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to group words by their frequency signature
        HashMap<String, List<String>> map = new HashMap<>();

        // For each word in the input array
        for (String word : strs) {
            // Create a frequency array for 26 lowercase letters
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            // Convert frequency array to a unique key string
            // Example: [1,0,0,0,1,0,...,1,...,0] -> "1#0#0#0#1#0#...#1#..."
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : freq) {
                keyBuilder.append(count).append('#'); // # separates counts
            }
            String key = keyBuilder.toString();

            // Add the word to its corresponding group
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        // Return all the grouped anagrams
        return new ArrayList<>(map.values());
    }
}
