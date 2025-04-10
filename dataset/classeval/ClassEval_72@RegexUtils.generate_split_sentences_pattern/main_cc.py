import re
class RegexUtils: 
    def generate_split_sentences_pattern(self):
        pattern = r'[.!?][\s]{1,2}(?=[A-Z])'
        return pattern