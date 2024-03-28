import sys

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.input = stream

    def nextInt(self):
        return int(self.nextLong())

    def nextLong(self):
        try:
            sign = 1
            b = self.input.read(1)
            while b and (not b.isdigit()) and b != '-' and b != '+':
                b = self.input.read(1)
            if b == '-':
                sign = -1
                b = self.input.read(1)
            elif b == '+':
                b = self.input.read(1)
            ret = int(b)
            while True:
                b = self.input.read(1)
                if not b or not b.isdigit():
                    return ret * sign
                ret *= 10
                ret += int(b)
        except Exception as e:
            print(e)
            return -1

    def nextDouble(self):
        try:
            sign = 1
            b = self.input.read(1)
            while b and (not b.isdigit()) and b != '-' and b != '+':
                b = self.input.read(1)
            if b == '-':
                sign = -1
                b = self.input.read(1)
            elif b == '+':
                b = self.input.read(1)
            ret = int(b)
            while True:
                b = self.input.read(1)
                if not b or not b.isdigit():
                    break
                ret *= 10
                ret += int(b)
            if b != '.':
                return sign * ret
            div = 1
            b = self.input.read(1)
            while b and b.isdigit():
                ret *= 10
                ret += int(b)
                div *= 10
                b = self.input.read(1)
            return sign * ret / div
        except Exception as e:
            print(e)
            return float('NaN')

    def nextChar(self):
        try:
            b = self.input.read(1)
            while b and b.isspace():
                b = self.input.read(1)
            return b
        except Exception as e:
            print(e)
            return ''

    def nextStr(self):
        try:
            sb = []
            b = self.input.read(1)
            while b and b.isspace():
                b = self.input.read(1)
            while b and not b.isspace():
                sb.append(b)
                b = self.input.read(1)
            return ''.join(sb)
        except Exception as e:
            print(e)
            return ''

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextIntArrayDec(self, n):
        return [self.nextInt() - 1 for _ in range(n)]

    def nextIntArray1Index(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextLongArrayDec(self, n):
        return [self.nextLong() - 1 for _ in range(n)]

    def nextLongArray1Index(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextDoubleArray(self, n):
        return [self.nextDouble() for _ in range(n)]

    def nextWrapperLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextWrapperLongArrayDec(self, n):
        return [self.nextLong() - 1 for _ in range(n)]

    def nextWrapperLongArray1Index(self, n):
        return [self.nextLong() for _ in range(n)]


class p02927:
    def __init__(self):
        self.inp = FastScanner(sys.stdin)
        self.out = sys.stdout
        self.MOD = int(1e9) + 7

    def printlnYN(self, b):
        self.out.write("Yes\n" if b else "No\n")
        
    def solve(self):
        M, D = self.inp.nextInt(), self.inp.nextInt()
        ans = 0
        for m in range(1, M + 1):
            for d in range(1, D + 1):
                d1 = d % 10
                d2 = d // 10
                if d1 >= 2 and d2 >= 2 and d1 * d2 == m:
                    ans += 1
        self.out.write(str(ans) + '\n')

    def main(self):
        self.m()

    def m(self):
        self.solve()
        self.out.flush()

if __name__ == "__main__":
    p = p02927()
    p.main()