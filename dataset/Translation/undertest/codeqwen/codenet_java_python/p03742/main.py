import sys

class FastScanner:
    def __init__(self):
        self.input = sys.stdin

    def next_int(self):
        return self.next_long()

    def next_long(self):
        try:
            sign = 1
            b = ord(self.input.read(1))
            while (b < ord('0') or ord('9') < b) and b != ord('-') and b != ord('+'):
                b = ord(self.input.read(1))
            if b == ord('-'):
                sign = -1
                b = ord(self.input.read(1))
            elif b == ord('+'):
                b = ord(self.input.read(1))
            ret = b - ord('0')
            while True:
                b = ord(self.input.read(1))
                if b < ord('0') or ord('9') < b: return ret * sign
                ret *= 10
                ret += b - ord('0')
        except Exception as e:
            print(e)
            return -1

    def next_double(self):
        try:
            sign = 1
            b = ord(self.input.read(1))
            while (b < ord('0') or ord('9') < b) and b != ord('-') and b != ord('+'):
                b = ord(self.input.read(1))
            if b == ord('-'):
                sign = -1
                b = ord(self.input.read(1))
            elif b == ord('+'):
                b = ord(self.input.read(1))
            ret = b - ord('0')
            while True:
                b = ord(self.input.read(1))
                if b < ord('0') or ord('9') < b: break
                ret *= 10
                ret += b - ord('0')
            if b != ord('.'): return sign * ret
            div =