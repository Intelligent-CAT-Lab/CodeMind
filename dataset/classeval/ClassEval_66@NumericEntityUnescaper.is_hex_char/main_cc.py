
class NumericEntityUnescaper: 
    def __init__(self):
        pass

    @staticmethod
    def is_hex_char(char):
        return char.isdigit() or ('a' <= char.lower() <= 'f')