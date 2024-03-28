import sys
import math

class FastScanner:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        return self.br.readline().strip()

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLong(self):
        return long(self.next())

    def nextline(self):
        return self.next()

def main():
    sc = FastScanner()
    s = sc.next()
    t = sc.next()
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b * b == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()