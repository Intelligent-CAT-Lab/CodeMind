import sys

class FastScanner:
    def __init__(self):
        self.input = sys.stdin

    def nextInt(self):
        return int(self.nextLong())

    def nextLong(self):
        try:
            sign = 1
            b = self.input.read(1)
            while (b < '0' or '9' < b) and b != '-' and b != '+':
                b = self.input.read(1)
            if b == '-':
                sign = -1
                b = self.input.read(1)
            elif b == '+':
                b = self.input.read(1)
            ret = int(b)
            while True:
                b = self.input.read(1)
                if b < '0' or '9' < b:
                    return ret * sign
                ret *= 10
                ret += int(b)
        except ValueError:
            return -1

def solve():
    scanner = FastScanner()
    M, D = map(int, input().split())
    ans = 0
    for m in range(1, M+1):
        for d in range(1, D+1):
            d1 = d % 10
            d2 = d // 10
            if d1 >= 2 and d2 >= 2 and d1 * d2 == m:
                ans += 1
    print(ans)

if __name__ == "__main__":
    solve()