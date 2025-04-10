from collections import Counter
import re
class NLPDataProcessor2: 
    def process_data(self, string_list):
        words_list = []
        for string in string_list:
            # Remove non-English letters and convert to lowercase
            processed_string = re.sub(r'[^a-zA-Z\s]', '', string.lower())
            # Split the string into words
            words = processed_string.split()
            words_list.append(words)
        return words_list
    def process(self, string_list):
        words_list = self.process_data(string_list)
        word_frequency_dict = self.calculate_word_frequency(words_list)
        return word_frequency_dict