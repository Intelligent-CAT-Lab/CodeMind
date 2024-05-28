import re
def text_match_one(text):
        patterns = 'ab+?'
        if re.search(patterns,  text):
                return True
        else:
                return False
