```python
import math
import sys

class FastScanner:
    def __init__(self):
        self.input_buffer = sys.stdin.buffer
        self.buffer = b''
        self.pos = 0

    def read_byte(self):
        if self.pos >= len(self.buffer):
            self.buffer = self.input_buffer.read(1024)
            self.pos = 0
        if not self.buffer:
            return -1
        self.pos += 1
        return self.buffer[self.pos - 1]

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self.read_byte() >= 0 and not self.is_printable_char(self.buffer[self.pos - 1]):
            continue
        return self.buffer is not b''

    def next(self):
        if not self.has_next():
            raise StopIteration
        sb = bytearray()
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
        return sb.decode('ascii')


def combination(n, k):
    return math.comb(n, k)


def solve():
    scanner = FastScanner()
    n = scanner.next_int()
    k = scanner.next_int()

    if n == 2:
        if k == 0:
            print(1)
            print("1 2")
        else:
            print(-1)
        return

    max_ = combination(n-1, 2)
    if k > max_:
        print(-1)
        return

    m = n - 1 + (max_ - k)
    print(m)
    for i in range(2, n + 1):
        print(1, i)

    cnt = max_ - k
    if cnt > 0:
        for i in range(2, n):
            for j in range(i + 1, n + 1):
                print(i, j)
                cnt -= 1
                if cnt <= 0:
                    return

if __name__ == "__main__":
    solve()
```
```
