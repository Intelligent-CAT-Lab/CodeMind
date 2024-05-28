import re
def text_match_three(text):
        patterns = 'ab{3}?'
        return re.search(patterns,  text)