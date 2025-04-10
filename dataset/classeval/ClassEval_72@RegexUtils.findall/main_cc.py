import re
class RegexUtils: 
    def findall(self, pattern, text):
        return re.findall(pattern, text)