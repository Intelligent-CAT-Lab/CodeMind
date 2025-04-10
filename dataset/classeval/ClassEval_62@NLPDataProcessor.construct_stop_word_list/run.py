import os
import unittest
class NLPDataProcessor:

    def construct_stop_word_list(self):
        stop_word_list = ['a', 'an', 'the']
        return stop_word_list

    def remove_stop_words(self, string_list, stop_word_list):
        answer = []
        for string in string_list:
            string_split = string.split()
            for word in string_split:
                if word in stop_word_list:
                    string_split.remove(word)
            answer.append(string_split)
        return answer

    def process(self, string_list):
        stop_word_list = self.construct_stop_word_list()
        words_list = self.remove_stop_words(string_list, stop_word_list)
        return words_list
class Test(unittest.TestCase):
    def test(self):
            self.processor = NLPDataProcessor()
            stop_word_list = self.processor.construct_stop_word_list()
            expected_stop_words = ['a', 'an', 'the']
            return stop_word_list,expected_stop_words
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_62@NLPDataProcessor.construct_stop_word_list/output.txt', 'w') as wr:
    wr.write(str(a))
        