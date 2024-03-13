import sys

class FastScanner:
    def __init__(self):
        self.st = None
        self.reader = sys.stdin

    def next(self):
        if self.st is None or not self.st.strip():
            self.st = self.reader.readline()
        return self.st

    def nextInt(self):
        return int(self.next())

    def nextLine(self):
        self.st = None
        return self.reader.readline()

    def nextIntArr(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArr(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextLong(self):
        return long(self.next())


def solve():
    fs = FastScanner()
    a = fs.nextInt()
    b = fs.nextInt()
    c = fs.nextInt()

    if a == b == c:
        print("Yes")
    else:
        print("No")


if __name__ == "__main__":
    solve()