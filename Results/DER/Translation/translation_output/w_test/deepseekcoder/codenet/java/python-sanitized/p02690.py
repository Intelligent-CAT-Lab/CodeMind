class FastScanner:
    def __init__(self):
        import sys
        self.reader = sys.stdin

    def next(self):
        return self.reader.readline().strip()

    def nextInt(self):
        return int(self.next())


def pow(base, n):
    retVal = 1
    while n > 0:
        if n & 1:
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
            print(powMap[powVal], end=" ")
            if powVal - x < 0:
                print("-", powMap[diff])
            else:
                print(powMap[diff])
            return


if __name__ == "__main__":
    solve()