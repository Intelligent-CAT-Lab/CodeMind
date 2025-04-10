import re
class RegexUtils: 
    def split(self, pattern, text):
        return re.split(pattern, text)