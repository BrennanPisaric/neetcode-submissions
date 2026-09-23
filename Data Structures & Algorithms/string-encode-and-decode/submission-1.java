class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String s: strs){
            //appends the length of the string so you can easily decode string by knowing how
            //many characters it has 
            encodedString.append(s.length()).append('#').append(s);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        // 1️⃣ Find the '#' that separates the length and the string
        int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }

        // 2️⃣ Extract the length before '#'
        int length = Integer.parseInt(str.substring(i, j));

        // 3️⃣ Extract the actual string that follows
        String word = str.substring(j + 1, j + 1 + length);
        result.add(word);

        // 4️⃣ Move the pointer past this word
        i = j + 1 + length;
    }

    return result;
    }
}
