```python
from io import BytesIO
import sys

INPUT = None

class Scanner:
    def __init__(self, stream):
        self.stream = stream

    def is_printable(self, ch):
        return ch >= 33 and ch <= 126

    def is_crlf(self, ch):
        return ch == 10 or ch == 13 or ch == -1

    def next_printable(self):
        try:
            ch = self.stream.read(1)
            while not self.is_printable(ch):
                if ch == b'':
                    raise StopIteration
                ch = self.stream.read(1)
            return ch
        except:
            raise StopIteration

    def next(self):
        try:
            ch = self.next_printable()
            sb = bytearray()
            while self.is_printable(ch):
                sb.append(ch)
                ch = self.stream.read(1)
            return sb.decode('utf-8')
        except:
            raise StopIteration

    def next_int(self):
        try:
            negative = False
            res = 0
            limit = -sys.maxsize
            radix = 10

            fc = self.next_printable()
            if fc < b'0':
                if fc == b'-':
                    negative = True
                    limit = -sys.maxsize
                elif fc != b'+':
                    raise ValueError
                fc = self.stream.read(1)
            
            multmin = limit // radix

            ch = fc
            while self.is_printable(ch):
                digit = int(ch) - 48
                if digit < 0 or digit >= radix:
                    raise ValueError
                if res < multmin:
                    raise ValueError
                res *= radix
                if res < limit + digit:
                    raise ValueError
                res -= digit

                ch = self.stream.read(1)

            return res if not negative else -res
        except:
            raise ValueError

class Euler:
    def __init__(self, n):
        self.phi = [i for i in range(1, n+1)]

        for i in range(2, n+1):
            if self.phi[i-1] == i:
                for j in range(i, n+1, i):
                    self.phi[j-1] = self.phi[j-1] // i * (i - 1)

    def totient(self, n):
        return self.phi[n - 1]

    @staticmethod
    def totient_long(n):
        i = n
        phi = n
        if i % 2 == 0:
            phi = phi // 2
            while i % 2 == 0:
                i //= 2
        if i % 3 == 0:
            phi = phi // 3 * 2
            while i % 3 == 0:
                i //= 3
        j = 1
        while True:
            tmp1 = j * 6 - 1
            if tmp1 * tmp1 > n:
                break
            if i % tmp1 == 0:
                phi = phi // tmp1 * (tmp1 - 1)
                while i % tmp1 == 0:
                    i //= tmp1

            tmp2 = j * 6 + 1
            if tmp2 * tmp2 > n:
                break
            if i % tmp2 == 0:
                phi = phi // tmp2 * (tmp2 - 1)
                while i % tmp2 == 0:
                    i //= tmp2

            j += 1

        if i != 1:
            phi = phi // i * (i - 1)

        return phi


def solve():
    n = int(sc.next())
    pr.println(Euler.totient_long(n))


sc = Scanner(BytesIO(INPUT.encode()))
pr = sys.stdout

solve()
```
