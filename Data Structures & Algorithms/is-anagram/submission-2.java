class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they can't be anagrams
        if (s.length() != t.length()) return false;

        // Frequency counter for all lowercase letters
        int[] count = new int[26];

        // Increment counts for s, decrement for t
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // If all counts are zero, it's an anagram
        for (int freq : count) {
            if (freq != 0) return false;
        }

        return true;
    }
}
