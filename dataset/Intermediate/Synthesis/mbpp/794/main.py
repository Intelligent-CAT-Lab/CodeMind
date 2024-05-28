import re
def text_starta_endb(text):
        patterns = 'a.*?b$'
        return re.search(patterns,  text)