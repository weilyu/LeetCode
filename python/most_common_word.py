class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        paragraph = paragraph.replace('!', ' ').replace('?', ' ') \
                        .replace('\'', ' ').replace(',', ' ') \
                        .replace(';', ' ').replace('.', ' ')
        words = [w.lower() for w in paragraph.split(' ')]
        words = filter(lambda w: w != '' and w not in banned, words)
        word_count = {}
        for w in words:
            word_count[w] = word_count.get(w, 0) + 1
        return max(word_count, key=word_count.get)
