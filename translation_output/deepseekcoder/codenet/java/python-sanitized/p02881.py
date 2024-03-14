import sys
import math

def solver(sc, out):
    n = sc.nextLong()
    sqrt = int(math.sqrt(n))
    x=0
    y=0
    for i in range(sqrt, 0, -1):
        if n % i == 0:
            x = i
            y = n // i
            break
    ans = 0
    if x != 0 and y != 0:
        ans = (x-1) + (y-1)
    else:
        ans = n - 1
    print(ans, file=out)

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def main():
    inp = sys.stdin
    out = sys.stdout
    sc = InputReader(inp)
    solver(sc, out)

class InputReader:
    def __init__(self, stream):
        self.reader = iter(stream.readline().split())

    def next(self):
        return self.reader.__next__()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def readLongArr(self, n):
        return [self.nextLong() for _ in range(n)]

    def readIntArr(self, n):
        return [self.nextInt() for _ in range(n)]

if __name__ == "__main__":
    main()

class Pair:
    def __init__(self, x, s):
        self.x = x
        self.s = s

    def __lt__(self, p):
        return self.x < p.x