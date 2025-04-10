import unittest
import re
import string


class LongestWord:

    def __init__(self):
        self.word_list = []

    def add_word(self, word):
        self.word_list.append(word)

    def find_longest_word(self, sentence):
        longest_word = ""
        sentence = sentence.lower()
        sentence = re.sub('[%s]' % re.escape(string.punctuation), '', sentence)
        sentence = re.split(' ', sentence)
        for word in sentence:
            if word in self.word_list and len(word) > len(longest_word):
                longest_word = word
        return longest_word
class Test(unittest.TestCase):
    def test(self):
            longestWord = LongestWord()
            longestWord.add_word("a")
            sentence = 'I am a student.'
            return longestWord.find_longest_word(sentence)