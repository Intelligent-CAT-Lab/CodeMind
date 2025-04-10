import os
import unittest
import re


class SplitSentence:

    def split_sentences(self, sentences_string):
        sentences = re.split(r'(?<!\w\.\w.)(?<![A-Z][a-z]\.)(?<=\.|\?)\s', sentences_string)
        return sentences

    def count_words(self, sentence):
        sentence = re.sub(r'[^a-zA-Z\s]', '', sentence)
        words = sentence.split()
        return len(words)

    def process_text_file(self, sentences_string):
        sentences = self.split_sentences(sentences_string)
        max_count = 0
        for sentence in sentences:
            count = self.count_words(sentence)
            if count > max_count:
                max_count = count

        return max_count
class Test(unittest.TestCase):
    def test(self):
            ss = SplitSentence()
            cnt = ss.process_text_file("Mr. Smith is a teacher. Yes 1 2 3 4 5 6.")
            return cnt
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_78@SplitSentence.process_text_file/output.txt', 'w') as wr:
    wr.write(str(a))
        