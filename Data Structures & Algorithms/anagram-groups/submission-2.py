class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        n = len(strs)
        counts = [[0 for i in range(26)] for j in range(n)]

        for i in range(n):
            string = strs[i]

            for c in string:
                counts[i][ord(c)-ord("a")]+=1

        hash_table = defaultdict(list)
        for i in range(n):
            count = counts[i]
            hash_table[tuple(count)].append(strs[i])

        result = []

        for key, value in hash_table.items():
            result.append(value)

        return result