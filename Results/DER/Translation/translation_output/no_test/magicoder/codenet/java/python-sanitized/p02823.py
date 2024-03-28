import sys

class In:
    def __init__(self):
        self.reader = sys.stdin

    def next(self):
        return self.reader.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextCharArray(self, n, m):
        a = [self.next() for _ in range(n)]
        return [list(row) for row in a]

    def nextIntArray(self, n):
        return [int(x) for x in self.next().split()]

    def nextLongArray(self, n):
        return [int(x) for x in self.next().split()]

class Out:
    def __init__(self):
        self.writer = sys.stdout

    def println(self, *a):
        print(*a, file=self.writer)

    def flush(self):
        self.writer.flush()

in_ = In()
out = Out()

def solve():
    n = in_.nextLong()
    a = in_.nextLong()
    b = in_.nextLong()
    if a > b:
        a, b = b, a
    if (b - a) % 2 == 1:
        ans1 = a - 1 + (b - a + 1) // 2
        a = n - a + 1
        b = n - b + 1
        if a > b:
            a, b = b, a
        ans2 = a - 1 + (b - a + 1) // 2
        out.println(min(ans1, ans2))
    else:
        out.println((b - a) // 2)

solve()
out.flush()