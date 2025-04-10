
import sys
import trace
import os
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
            longestWord.add_word("hello")
            longestWord.add_word("world")
            longestWord.add_word("!")
            longestWord.add_word("!")
            longestWord.add_word("!")
            return longestWord.word_list
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_53@LongestWord.add_word/output.txt', 'w') as wr:
    wr.write(str(a))
        

tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
