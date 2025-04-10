import unittest
class NumericEntityUnescaper:
    def __init__(self):
        pass

    def replace(self, string):
        out = []
        pos = 0
        length = len(string)

        while pos < length - 2:
            if string[pos] == '&' and string[pos + 1] == '#':
                start = pos + 2
                is_hex = False
                first_char = string[start]

                if first_char == 'x' or first_char == 'X':
                    start += 1
                    is_hex = True

                if start == length:
                    return ''.join(out)

                end = start
                while end < length and self.is_hex_char(string[end]):
                    end += 1

                if end < length and string[end] == ';':
                    try:
                        entity_value = int(string[start:end], 16 if is_hex else 10)
                    except:
                        return ''.join(out)

                    out.append(chr(entity_value))
                    pos = end + 1
                    continue

            out.append(string[pos])
            pos += 1

        return ''.join(out)

    @staticmethod
    def is_hex_char(char):
        return char.isdigit() or ('a' <= char.lower() <= 'f')
class Test(unittest.TestCase):
    def test(self):
            unescaper = NumericEntityUnescaper()
            res = unescaper.is_hex_char('F')
            return res