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
            a[i] = self.next().toCharArray()
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

    def println(self, *a):
        joiner = " ".join(map(str, a))
        self.out.println(joiner)

    def flush(self):
        self.out.flush()

class p02823:
    def __init__(self):
        self.in = In()
        self.out = Out()
        self.mod = 1000000007
        self.inf = 0xfffffffffffffffL

    def solve(self):
        n = self.in.nextLong()
        a = self.in.nextLong()
        b = self.in.nextLong()
        if a > b:
            t = b
            b = a
            a = t
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) / 2
            a = n - a + 1
            b = n - b + 1
            if a > b:
                t = b
                b = a
                a = t
            ans2 = a - 1 + (b - a + 1) / 2
            self.out.println(min(ans1, ans2))
        else:
            self.out.println((b - a) / 2)

if __name__ == "__main__":
    p02823().solve()
    out.flush()