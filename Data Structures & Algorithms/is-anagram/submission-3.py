class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        len1 = len(s)
        len2 = len(t)

        if len1 != len2:
            return False

        charS = [0]*26
        charT = [0]*26

        for char in s:
            charS[ord(char) - ord('a')] += 1

        for char in t:
            charT[ord(char) - ord('a')] += 1

        if charS == charT:
            return True

        return False


        