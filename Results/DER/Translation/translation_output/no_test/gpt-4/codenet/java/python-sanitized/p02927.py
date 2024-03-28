import io
import sys

MOD = int(1e9) + 7

def printlnYN(b):
    print("Yes" if b else "No")

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.reader = io.BufferedReader(stream)
        self.buffer = ''

    def next(self):
        while not self.buffer.strip():
            self.buffer = self.reader.readline().decode()
        result, self.buffer = self.buffer.strip().split(None, 1)
        return result

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())  # In Python, int can handle long integers

    def nextDouble(self):
        return float(self.next())

    def nextChar(self):
        return self.next()[0]

    def nextStr(self):
        return self.next()

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextIntArrayDec(self, n):
        return [self.nextInt() - 1 for _ in range(n)]

    def nextIntArray1Index(self, n):
        return [0] + [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextLongArrayDec(self, n):
        return [self.nextLong() - 1 for _ in range(n)]

    def nextLongArray1Index(self, n):
        return [0] + [self.nextLong() for _ in range(n)]

    def nextDoubleArray(self, n):
        return [self.nextDouble() for _ in range(n)]

    def nextWrapperLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextWrapperLongArrayDec(self, n):
        return [self.nextLong() - 1 for _ in range(n)]

    def nextWrapperLongArray1Index(self, n):
        return [0] + [self.nextLong() for _ in range(n)]

def solve(M, D):
    ans = 0
    for m in range(1, M + 1):
        for d in range(1, D + 1):
            d1 = d % 10
            d2 = d // 10
            if d1 >= 2 and d2 >= 2 and d1 * d2 == m:
                ans += 1
    return ans

def main():
    inreader = FastScanner()
    out = sys.stdout
    # Here, you need to ensure that input is given in the same way as
    # expected by the Java code, since Python input handling will be different.

    M = inreader.nextInt()
    D = inreader.nextInt()
    answer = solve(M, D)
    out.write(str(answer) + '\n')

if __name__ == "__main__":
    main()