import re
class RegexUtils: 
    def sub(self, pattern, replacement, text):
        return re.sub(pattern, replacement, text)