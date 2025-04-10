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
            string_list = ['This is a test.', 'This is an apple.', 'This is the dog.']
            words_list = self.processor.process(string_list)
            expected_words_list = [['This', 'is', 'test.'], ['This', 'is', 'apple.'], ['This', 'is', 'dog.']]
            return words_list,expected_words_list