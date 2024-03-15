import sys

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = sys.stdin.readline().split()

    def next(self):
        while not self.st:
            try:
                self.st = sys.stdin.readline().split()
            except:
                pass
        return self.st[0]

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = [int(x) for x in self.nextInt() for _ in range(n)]
        return a

    def nextLong(self):
        return long(self.next())

    def nextline(self):
        return None


if __name__ == "__main__":
    sc = FastScanner()
    s, t = sc.next(), sc.next()
    mah = s + t
    a = sc.nextInt()
    b = int(math.sqrt(a))
    if b * b == a:
        print("Yes")
    else:
        print("No")