```python
# package atcoder.agc.agc016

import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.cur_char = 0
        self.num_chars = 0

    def read(self, size):
        while self.num_chars == 0:
            self.buf = self.stream.read(1 << 13)
            self.num_chars = len(self.buf)
            if self.num_chars == 0:
                return -1
        if size is None:
            return self.buf[self.cur_char]
        else:
            return self.ints(size)

    def read_ints(self, n):
        return [self.int() for _ in range(n)]

    def read_int_table(self, n, m):
        return [self.read_ints(m) for _ in range(n)]

    def read_long(self):
        return int(self.read_token())

    def read_long_table(self, n, m):
        return [[self.read_long() for _ in range(m)] for _ in range(n)]

    def read_double(self):
        return float(self.read_token())

    def int(self):
        c = self.read()
        while c in b' \r\n\t':
            c = self.read()
        if c == b'-':
            sgn = -1
            c = self.read()
        else:
            sgn = 1
        res = 0
        while b'0' <= c <= b'9':
            res = res * 10 + c - ord(b'0')
            c = self.read()
        return res * sgn

    def long(self):
        return int(self.token())

    def double(self):
        return float(self.token())

    def token(self):
        c = self.read()
        while c in b' \r\n\t':
            c = self.read()
        res = bytearray()
        while c not in b' \r\n\t':
            res += bytes([c])
            c = self.read()
        return res

r, c, h, w = map(int, sys.stdin.readline().split())

if r % h == 0 and c % w == 0:
    print("No")
    sys.stdout.flush()
    sys.exit()

mcnt = (r // h) * (c // w)
space = r * c - ((r // h) * h) * ((c // w) * w)

plus_number = ((mcnt + space) // space) + 1
minus_number = -(plus_number * (h * w - 1) + 1)

print("Yes")
for i in range(r):
    for j in range(c):
        num = minus_number if (i+1) % h == 0 and (j+1) % w == 0 else plus_number
        if j >= 1:
            print(' ', end='')
        print(num, end='')
    print()
sys.stdout.flush()
```
Note: This translation assumes that the standard input and output streams are used for reading and writing. The translation includes a simplified version of the InputReader class for reading input.
