```python
import sys
from io import BufferedReader
from io import BufferedWriter
from io import BytesIO
from io import IOBase
from os import read

"""
Lightweight I/O and math functions

@author: mikit
"""

class Vec2i:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __eq__(self, other):
        return (self.x, self.y) == (other.x, other.y)

    def __hash__(self):
        return hash((self.x, self.y))

    def __repr__(self):
        return f"({self.x}, {self.y})"

    def __lt__(self, other):
        return (self.x, self.y) < (other.x, other.y)

class LightScanner:
    def __init__(self, reader):
        self.reader = reader
        self.token = None

    def string(self):
        if self.token is None or not self.token:
            self.token = self.reader.readline().split()
        return self.token.pop(0)

    def ints(self):
        return int(self.string())

class LightWriter:
    def __init__(self, writer):
        self.writer = writer
        self.autoflush = False
        self.breaked = True

    def print_char(self, c):
        self.writer.write(c)
        self.breaked = False

    def print_string(self, s):
        self.writer.write(s)
        self.breaked = False

    def ans(self, s):
        if not self.breaked:
            self.print_char(' ')
        self.print_string(s)

    def ln(self):
        self.print_string('\n')
        self.breaked = True
        if self.autoflush:
            self.writer.flush()

    def close(self):
        self.writer.close()

def solve(test_number, in_reader, out_writer):
    n = in_reader.ints()
    ans = set()
    for i in range(1, n, 2):
        ans.add(Vec2i(i, 0))
        ans.add(Vec2i(0, i))
    for i in range(n % 2, n, 2):
        ans.add(Vec2i(i, n - 1))
        ans.add(Vec2i(n - 1, i))
    offset = 0
    d = 2
    for _ in range(10):
        for i in range(1, n, 2 * d):
            for j in range(offset, n, 2 * d):
                ans.add(Vec2i(i, j))
        for i in range(d + 1, n, 2 * d):
            for j in range(offset + d, n, 2 * d):
                ans.add(Vec2i(i, j))
        offset += d
        d *= 2

    out_writer.ans(len(ans)).ln()
    for an in sorted(ans):
        out_writer.ans(an.x).ans(an.y).ln()

def main():
    input_data = sys.stdin.buffer
    output_data = sys.stdout.buffer
    in_reader = LightScanner(BufferedReader(input_data))
    out_writer = LightWriter(BufferedWriter(output_data))
    solve(1, in_reader, out_writer)
    out_writer.close()

if __name__ == '__main__':
    main()
```
Note: In the provided solution, I have tried to maintain the structure and logic as close as possible to the original Java code while utilizing Python's features. Let me know if you have any questions or need further modifications.
