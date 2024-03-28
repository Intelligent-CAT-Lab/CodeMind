import sys
import time
import threading
import io
import re
import collections

class p03582:
    def __init__(self):
        self.start_time = 0
        self.debug = False
        self.reader = None
        self.out = None
        self.tokenizer = None
        self.is_ = None

    def solve(self):
        a = self.na(3)
        list_ = []
        for j in range(3):
            for i in range(a[j]):
                list_.append(chr(ord('a') + j))

        while len(list_) > 1:
            list_.sort()
            last = len(list_) - 1
            s = list_[0] + list_[last]
            list_[0] = s
            list_.pop(last)

        print(list_[0])

    def main(self):
        self.is_ = sys.stdin
        self.out = io.StringIO()
        self.reader = io.BufferedReader(io.InputStreamReader(self.is_), 32768)
        self.start_time = time.time()
        self.solve()
        print(self.out.getvalue())
        print(f"{(time.time() - self.start_time) * 1000}ms")

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                line = self.reader.readLine()
                self.tokenizer = re.split(r'\s+', line)
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.nextToken()

    def nd(self):
        return float(self.next())

    def nl(self):
        return int(self.next())

    def na(self, n):
        a = [0]*n
        for i in range(n):
            a[i] = self.ni()
        return a

    def ns(self):
        return self.next().toCharArray()

    def nal(self, n):
        a = [0]*n
        for i in range(n):
            a[i] = self.nl()
        return a

    def ntable(self, n, m):
        table = [[0]*m for _ in range(n)]
        for i in range(n):
            for j in range(m):
                table[i][j] = self.ni()
        return table

    def nlist(self, n, m):
        table = [[0]*n for _ in range(m)]
        for i in range(n):
            for j in range(m):
                table[j][i] = self.ni()
        return table

    def ni(self):
        return int(self.next())

    def tr(self, *o):
        if self.is_ != sys.stdin:
            print(o)

if __name__ == "__main__":
    p03582().main()