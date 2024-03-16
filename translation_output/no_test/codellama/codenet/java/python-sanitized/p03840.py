import sys

class In:
    def __init__(self):
        self.reader = sys.stdin
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = self.reader.readline()
            except:
                pass
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextCharArray(self, n, m):
        a = [[0] * m for _ in range(n)]
        for i in range(n):
            a[i] = self.next().split()
        return a

    def nextIntArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextInt()
        return a

    def nextIntArray(self, n, op):
        a = [0] * n
        for i in range(n):
            a[i] = op(self.nextInt())
        return a

    def nextLongArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextLong()
        return a

    def nextLongArray(self, n, op):
        a = [0] * n
        for i in range(n):
            a[i] = op(self.nextLong())
        return a

class Out:
    def __init__(self):
        self.out = sys.stdout
        self.autoFlush = False

    def println(self, *a):
        joiner = " ".join(map(str, a))
        self.out.write(joiner + "\n")
        if self.autoFlush:
            self.out.flush()

    def println(self, a):
        joiner = " ".join(map(str, a))
        self.out.write(joiner + "\n")
        if self.autoFlush:
            self.out.flush()

    def println(self, a):
        joiner = " ".join(map(str, a))
        self.out.write(joiner + "\n")
        if self.autoFlush:
            self.out.flush()

    def flush(self):
        self.out.flush()

in = In()
out = Out()
mod = 1000000007
iinf = 0xfffffff
inf = 0xfffffffffffffffL

def solve():
    ai = in.nextInt()
    ao = in.nextInt()
    at = in.nextInt()
    aj = in.nextInt()
    al = in.nextInt()
    as = in.nextInt()
    az = in.nextInt()
    ans = 0
    ans += ao
    if (ai % 2 + aj % 2