class Solution:
    def longestWord(self, words: List[str]) -> str:
        words = sorted(words)
        longest_words = set()
        for w in words:
            if len(w) == 1:
                longest_words.add(w)
            elif w[:len(w) - 1] in longest_words:
                longest_words.add(w)
        longest_word = ''
        for w in longest_words:
            if len(w) > len(longest_word) or (len(w) == len(longest_word) and w < longest_word):
                longest_word = w
        return longest_word
                
