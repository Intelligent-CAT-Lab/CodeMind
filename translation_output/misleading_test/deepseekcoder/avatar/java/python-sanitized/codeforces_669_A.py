class FastReader:
    import sys
    import io
    def __init__(self, s=None):
        if s is None or len(s) == 0:
            self.s = sys.stdin.read().lstrip().rstrip()
        else:
            self.s = s.lstrip().rstrip()
        self.chars = iter(self.s)

    def next(self):
        while True:
            c = next(self.chars, None)
            if c is not None and c != ' ':
                return c

    def readArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

def codeforces_669_A(n):
    fr = FastReader()
    n = fr.nextInt()
    total = 0
    if n == 2:
        return 1
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    return total

print(codeforces_669_A(999999991))