import sys

class FastScanner:
    def __init__(self):
        self.reader = (line for line in sys.stdin)
        self.tokens = None

    def next(self):
        while True:
            if self.tokens is None or not self.tokens.hasMoreElements():
                self.tokens = iter(input().split())
            try:
                return self.tokens.next()
            except StopIteration:
                pass

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextIntArr(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArr(self, n):
        return [self.nextLong() for _ in range(n)]


def pow(base, n):
    retVal = 1
    while n > 0:
        if n & 1 == 1:
            retVal *= base
        n >>= 1
        base *= base
    return retVal


def solve():
    fs = FastScanner()
    x = fs.nextInt()

    powMap = {0: 0, 1: 1}
    beforePow = 1
    base = 2
    while True:
        powVal = pow(base, 5)
        powMap[powVal] = base
        if powVal - beforePow > x:
            break
        base += 1
        beforePow = powVal

    for powVal in powMap:
        diff = abs(x - powVal)
        if diff in powMap:
            print(powMap[powVal], end='')
            if powVal - x < 0:
                print(" -"+str(powMap[diff]), end='')
            else:
                print(" "+str(powMap[diff]), end='')
            print()
            return


if __name__ == "__main__":
    solve()