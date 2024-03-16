import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.st = None

    def next(self):
        while self.st is None or not self.st:
            self.st = input().split()
        self.st, res = self.st[1:], self.st[0]
        return res

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

sc = FastScanner(sys.stdin)
n = sc.nextLong()
a = sc.nextLong()
b = sc.nextLong()
ans = 0
ans = (n // (a + b)) * a + min(a, n % (a + b))
print(ans)

/problems/p0000