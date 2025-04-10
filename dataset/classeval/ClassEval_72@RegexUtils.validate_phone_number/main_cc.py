import re
class RegexUtils: 
    def validate_phone_number(self, phone_number):
        pattern = self.generate_phone_number_pattern()
        return self.match(pattern, phone_number)
    def match(self, pattern, text):
        ans = re.match(pattern, text)
        if ans:
            return True
        else:
            return False
    def generate_phone_number_pattern(self):
        pattern = r'\b\d{3}-\d{3}-\d{4}\b'
        return pattern