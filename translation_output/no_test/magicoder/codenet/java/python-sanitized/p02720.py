import sys

class FasterScanner:
    def __init__(self, is_):
        self.is_ = is_
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise ValueError("InputMismatchException")
        if self.curChar >= self.numChars:
            self.curChar = 0
            self.numChars = self.is_.readinto(self.buf)
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar]

    def next_line(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        res = []
        while not self.is_end_of_line(c):
            res.append(chr(c))
            c = self.read()
        return ''.join(res)

    def next_string(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        res = []
        while not self.is_space_char(c):
            res.append(chr(c))
            c = self.read()
        return ''.join(res)

    def next_long(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_space_char(c):
            if c < ord('0') or c > ord('9'):
                raise ValueError("InputMismatchException")
            res *= 10
            res += c - ord('0')
            c = self.read()
        return res * sgn

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_space_char(c):
            if c < ord('0') or c > ord('9'):
                raise ValueError("InputMismatchException")
            res *= 10
            res += c - ord('0')
            c = self.read()
        return res * sgn

    def is_space_char(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

    def is_end_of_line(self, c):
        return c == ord('\n') or c == ord('\r') or c == -1

    def close(self):
        self.is_.close()

class p02720:
    def __init__(self):
        sc = FasterScanner(sys.stdin)

        k = sc.next_int()
        list = []
        for i in range(1, 10):
            list.append(i)
        val = -1
        while k > 0:
            val = list[0]
            del list[0]
            if val %