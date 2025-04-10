import re
class RegexUtils: 
    def extract_email(self, text):
        pattern = self.generate_email_pattern()
        return self.findall(pattern, text)
    def findall(self, pattern, text):
        return re.findall(pattern, text)
    def generate_email_pattern(self):
        pattern = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b'
        return pattern