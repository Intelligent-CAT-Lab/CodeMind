import sys

class FastScanner:

    def __init__(self):
        self.reader = sys.stdin
        self.st = None

    def next(self):
        if self.st is None or not self.st:
            self.st = self.reader.readline().split()
        return self.st.pop(0)

    def nextLine(self):
        self.st = None
        return self.reader.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextIntArr(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArr(self, n):
        return [self.nextLong() for _ in range(n)]

    def close(self):
        self.reader.close()

def solve():
    fs = FastScanner()
    a = fs.nextInt()
    b = fs.nextInt()
    c = fs.nextInt()

    if a == b and b == c:
        print("Yes")
    else:
        print("No")

if __name__ == '__main__':
    solve()