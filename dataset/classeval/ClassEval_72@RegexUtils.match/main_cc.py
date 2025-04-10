import re
class RegexUtils: 
    def match(self, pattern, text):
        ans = re.match(pattern, text)
        if ans:
            return True
        else:
            return False