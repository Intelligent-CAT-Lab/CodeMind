import sys
import math

class FastScanner:
    def __init__(self, file_name):
        self.file_name = file_name
        self.file = open(file_name, "r")
        self.buffer = []
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.file.read(self.buffer, 1024)
            if self.buflen <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr++]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException()
        sb = ""
        b = self.read_byte()
        while self.is_printable_char(b):
            sb += chr(b)
            b = self.read_byte()
        return sb

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.read_byte()
        if b == '-':
            minus = True
            b = self.read_byte()
        if b < '0' or '9' < b:
            raise NumberFormatException()
        while True:
            if '0' <= b and b <= '9':
                n *= 10
                n += b - '0'
            elif b == -1 or not self.is_printable_char(b):
                return minus and -n or n
            else:
                raise NumberFormatException()
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < sys.maxsize or nl > sys.maxsize:
            raise NumberFormatException()
        return int(nl)

    def next_double(self):
        return float(self.next())

class Mas:
    def __init__(self, x, y, step):
        self.x = x
        self.y = y
        self.step = step

def pow(l, i):
    if i == 0:
        return 1
    else:
        if i % 2 == 0:
            val = pow(l, i / 2)
            return val * val % 2019
        else:
            return pow(l, i - 1) * l % 2019

def main():
    fs = FastScanner(sys.stdin)
    n = fs.next_int()
    k = fs.next_int()
    ans = 0
    for i in range(k, n + 1):
        f = i * (i - 1) / 2
        l = (n * 2 - i + 1) * i / 2
        add = l - f + 1
        ans = (ans + add) % 2019
    print(ans)

if __name__ == "__main__":
    main()