import re
class RegexUtils: 
    def generate_phone_number_pattern(self):
        pattern = r'\b\d{3}-\d{3}-\d{4}\b'
        return pattern