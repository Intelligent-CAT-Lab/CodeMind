import sys

class FastScanner:
    def __init__(self):
        self.reader = sys.stdin
        self.st = None

    def next(self):
        if self.st is None or not self.st.hasMoreElements():
            self.st = sys.stdin.readline()
        return self.st.nextToken()

    def nextLine(self):
        self.st = None
        return sys.stdin.readline()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextIntArr(self, n):
        retArr = []
        for i in range(n):
            retArr.append(self.nextInt())
        return retArr

    def nextLongArr(self, n):
        retArr = []
        for i in range(n):
            retArr.append(self.nextLong())
        return retArr

    def close(self):
        self.reader.close()

class p03079:
    def __init__(self):
        self.fastScanner = FastScanner()

    def solve(self):
        a = self.fastScanner.nextInt()
        b = self.fastScanner.nextInt()
        c = self.fastScanner.nextInt()

        if a == b and b == c:
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    p03079().solve()