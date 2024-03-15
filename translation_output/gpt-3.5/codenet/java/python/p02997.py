```python
import sys

class FastScanner:
    def __init__(self):
        self.in_stream = sys.stdin.buffer
        self.buffer = b''
        self.ptr = 0

    def hasNextByte(self):
        if self.ptr < len(self.buffer):
            return True
        self.ptr = 0
        self.buffer = self.in_stream.read(1024)
        if len(self.buffer) <= 0:
            return False
        return True

    def readByte(self):
        if self.hasNextByte():
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
        return -1

    @staticmethod
    def isPrintableChar(c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        sb = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(b)
            b = self.readByte()
        return sb.decode()

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:  # ord('-') == 45
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:  # ord('0') == 48, ord('9') == 57
            raise ValueError
        while True:
            if 48 <= b <= 57:
                n = n * 10 + b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return nl

    def nextDouble(self):
        return float(self.next())

class p02997:
    def __init__(self):
        self.out = sys.stdout
        self.scan = FastScanner()

    def main(self):
        self.solve()
        self.out.close()

    def solve(self):
        N = self.ni()
        K = self.ni()
        if N == 2:
            if K == 0:
                self.out.write('1\n1 2\n')
            else:
                self.out.write('-1\n')
            return
        max_val = self.combination(N - 1, 2)
        if K > max_val:
            self.out.write('-1\n')
            return
        M = N - 1 + (max_val - K)
        self.out.write(f"{M}\n")
        for i in range(2, N + 1):
            self.out.write(f"1 {i}\n")
        cnt = max_val - K
        if cnt > 0:
            for i in range(2, N):
                for j in range(i + 1, N + 1):
                    self.out.write(f"{i} {j}\n")
                    cnt -= 1
                    if cnt <= 0:
                        return

    def make_comb_dp(self, n):
        self.dp = [[0] * (n + 1) for _ in range(n + 1)]
        for i in range(n + 1):
            self.dp[i][0] = 1
            self.dp[i][i] = 1
        for i in range(2, n + 1):
            for j in range(1, i):
                self.dp[i][j] = self.dp[i - 1][j - 1] + self.dp[i - 1][j]
        self.initFlag = True

    initFlag = False

    def combination(self, n, k):
        if not self.initFlag:
            self.make_comb_dp(n)
            self.initFlag = True
        return self.dp[n][k]

    def ni(self):
        return self.scan.nextInt()

    def nl(self):
        return self.scan.nextLong()

if __name__ == "__main__":
    main = p02997()
    main.main()
```
Remember to adjust the input/output handling according to your needs, as this code assumes input from `sys.stdin` and output to `sys.stdout`.
