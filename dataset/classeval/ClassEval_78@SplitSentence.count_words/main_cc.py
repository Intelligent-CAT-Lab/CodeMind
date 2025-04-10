import re
class SplitSentence: 
    def count_words(self, sentence):
        sentence = re.sub(r'[^a-zA-Z\s]', '', sentence)
        words = sentence.split()
        return len(words)