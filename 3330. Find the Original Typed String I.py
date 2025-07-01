class Solution:
    def possibleStringCount(self, word: str) -> int:
        n = len(word)
        groups = []
        i = 0

        # Find groups of same letters
        while i < n:
            j = i
            while j < n and word[j] == word[i]:
                j += 1
            groups.append(j - i)
            i = j

        # Count total possible originals
        total = 1  # The string itself is always valid
        for length in groups:
            if length >= 2:
                total += length - 1

        return total