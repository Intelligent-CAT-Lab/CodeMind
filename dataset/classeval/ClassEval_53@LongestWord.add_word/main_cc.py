import re
import string
class LongestWord: 
    def __init__(self):
        """
        Initialize a list of word.
        """
        self.word_list = []

    def add_word(self, word):
        self.word_list.append(word)