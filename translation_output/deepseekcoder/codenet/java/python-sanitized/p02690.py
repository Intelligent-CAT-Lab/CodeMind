import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.st = None

    def next(self):
        if self.st is None or not self.st.strip():
            self.st = self.inp.readline()
        return self.st.split()[0]

    def nextInt(self):
        return int(self.next())

class p02690:
    def __init__(self):
        self.maxDiff = 1_000_000_000

    def solve(self):
        fs = FastScanner()
        x = fs.nextInt()

        powMap = {0: 0, 1: 1}
        beforePow = 1
        base = 2
        while True:
            powVal = self.pow(base, 5)
            powMap[powVal] = base
            if powVal - beforePow > x:
                break
            base += 1
            beforePow = powVal

        for powVal, base in powMap.items():
            diff = abs(x - powVal)
            if powVal - x < 0:
                sign = "-"
            else:
                sign = " "
            if diff in powMap:
                print(base, sign, powMap[diff])
                return

    def pow(self, base, n):
        retVal = 1
        while n > 0:
            if n & 1:
                retVal *= base
            n >>= 1
            base *= base
        return retVal

if __name__ == "__main__":
    mainObj = p02690()
    mainObj.solve()