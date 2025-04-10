def test(self):
        self.processor = NLPDataProcessor()
        stop_word_list = self.processor.construct_stop_word_list()
        expected_stop_words = ['a', 'an', 'the']
        return stop_word_list,expected_stop_words