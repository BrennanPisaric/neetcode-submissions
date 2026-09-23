class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word: strs){
            int[] letterFreq = new int[26];

            for(char c: word.toCharArray()){
                letterFreq[c-'a']++;
            }

            StringBuilder key = new StringBuilder();

            for(int count: letterFreq){
                key.append(count).append('#');
            }

            String mapKey = key.toString();

            map.computeIfAbsent(mapKey, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
