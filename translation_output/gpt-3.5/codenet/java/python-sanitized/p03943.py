import sys
import math

class FastScanner:
    def __init__(self):
        self.input_buffer = sys.stdin.buffer.read()
        self.pointer = 0

    def read_byte(self):
        if self.pointer < len(self.input_buffer):
            result = self.input_buffer[self.pointer]
            self.pointer += 1
            return result
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def next(self):
        result = []
        b = self.read_byte()
        while b != -1 and not self.is_printable_char(b):
            b = self.read_byte()
        while b != -1 and self.is_printable_char(b):
            result.append(chr(b))
            b = self.read_byte()
        return ''.join(result)

    def next_int(self):
        n = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        if not ord('0') <= b <= ord('9'):
            raise ValueError("Invalid input")
        while ord('0') <= b <= ord('9') or not self.is_printable_char(b):
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += (b - ord('0'))
            elif b == -1:
                return -n if minus else n
            else:
                raise ValueError("Invalid input")
            b = self.read_byte()
        return -n if minus else n

    def next_long(self):
        return self.next_int()

    def next_double(self):
        return float(self.next())

def main():
    scanner = FastScanner()
    a = scanner.next_int()
    b = scanner.next_int()
    c = scanner.next_int()

    i = a + b == c
    j = a + c == b
    k = b + c == a

    if i or j or k:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()