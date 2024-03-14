import sys

class FastReader:
    def __init__(self):
        self.buffer = ""
        self.pos = 0

    def readline(self):
        while self.pos >= len(self.buffer):
            try:
                self.buffer += sys.stdin.readline().strip()
            except:
                return ""
        line = self.buffer[self.pos:].strip()
        self.pos = len(self.buffer)
        return line

    def read(self):
        while self.pos >= len(self.buffer):
            try:
                self.buffer += sys.stdin.read().strip()
            except:
                return ""
        line = self.buffer[self.pos:].strip()
        self.pos = len(self.buffer)
        return line

    def next(self):
        return self.readline()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

class Solution:
    def solve(self):
        sc = FastReader()

        L = sc.nextInt()
        R = sc.nextInt()

        R -= L
        L %= 2019
        R += L

        res = 2019

        if R - L > 2019:
            print(0)
            return

        for i in range(L, R+1):
            for j in range(L, i):
                res = min(res, (i*j) % 2019)

        print(res)

if __name__ == '__main__':
    Solution().solve()