import sys
import io
from collections import deque, defaultdict
from heapq import heappop, heappush

class P03479:
    def __init__(self):
        self.INPUT = ""
        self.out = sys.stdout
        self.inbuf = io.BytesIO()
        self.ptrbuf = 0

    def solve(self):
        x = self.nl()
        y = self.nl()
        ans = 0
        while x <= y:
            ans += 1
            x *= 2
        print(ans, file=self.out)

    def run(self):
        is_input_empty = len(self.INPUT) == 0
        self.inbuf = io.BytesIO(self.INPUT.encode() if not is_input_empty else sys.stdin.buffer.read())
        start_time = sys.time()
        self.solve()
        self.out.flush()
        if not is_input_empty:
            print(f"{sys.time() - start_time}ms", file=sys.stderr)

    def read_byte(self):
        if self.ptrbuf >= len(self.inbuf.getvalue()):
            self.inbuf.seek(0)
            temp = self.inbuf.read(1024)
            if not temp:
                return -1
            self.inbuf = io.BytesIO(temp)
            self.ptrbuf = 0
        self.ptrbuf += 1
        return self.inbuf.getvalue()[self.ptrbuf - 1]

    def is_space_char(self, c):
        return chr(c) in (' ', '\t', '\n', '\r', '\x0b', '\x0c')

    def skip(self):
        b = self.read_byte()
        while b != -1 and self.is_space_char(b):
            b = self.read_byte()
        return b

    def ns(self):
        b = self.skip()
        sb = bytearray()
        while not self.is_space_char(b):
            sb.append(b)
            b = self.read_byte()
        return sb.decode('ascii')

    def ni(self):
        b = self.skip()
        minus = False
        if b == '-':
            minus = True
            b = self.read_byte()
        num = 0
        while True:
            if b >= ord('0') and b <= ord('9'):
                num = num * 10 + (b - ord('0'))
            else:
                return -num if minus else num
            b = self.read_byte()

    def nl(self):
        b = self.skip()
        minus = False
        if b == '-':
            minus = True
            b = self.read_byte()
        num = 0
        while True:
            if b >= ord('0') and b <= ord('9'):
                num = num * 10 + (b - ord('0'))
            else:
                return -num if minus else num
            b = self.read_byte()

if __name__ == '__main__':
    P03479().run()