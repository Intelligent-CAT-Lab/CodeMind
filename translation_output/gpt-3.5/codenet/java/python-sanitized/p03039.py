import sys
from io import BytesIO
from math import factorial

class P03039:
    def __init__(self):
        self.input_buffer = sys.stdin.buffer if sys.stdin else BytesIO()
        self.output_buffer = BytesIO()
        self.MOD = 998244353
        self.INF = float("inf")

    def solve(self):
        n, m, k = self.ni(), self.ni(), self.ni()

        xsum = 0
        ysum = 0

        xa = self.C(n*m-2, k-2) * self.enumFIF(1000000)[0][k-2] % self.MOD
        xb = 0
        for i in range(m):
            tmp = (i * (m - i) % self.MOD * n % self.MOD * n % self.MOD * 2 % self.MOD)
            xb += tmp
            xb %= self.MOD
        xc = xa * xb % self.MOD * self.C(k, 2) % self.MOD
        xsum = xc * self.enumFIF(1000000)[1][k] % self.MOD

        ya = self.C(n*m-2, k-2) * self.enumFIF(1000000)[0][k-2] % self.MOD
        yb = 0
        for i in range(n):
            tmp = (i * (n - i) % self.MOD * m % self.MOD * m % self.MOD * 2 % self.MOD)
            yb += tmp
            yb %= self.MOD
        yc = ya * yb % self.MOD * self.C(k, 2) % self.MOD
        ysum = yc * self.enumFIF(1000000)[1][k] % self.MOD

        self.out(f"{(xsum + ysum) % self.MOD}")

    def C(self, n, r):
        if n < 0 or r < 0 or r > n:
            return 0
        return factorial(n) * pow(factorial(r) * factorial(n - r), -1, self.MOD) % self.MOD

    def enumFIF(self, n):
        f = [1] * (n+1)
        invf = [1] * (n+1)
        for i in range(1, n+1):
            f[i] = f[i - 1] * i % self.MOD
        a = f[n]
        b = self.MOD
        p, q = 1, 0
        while b > 0:
            c = a // b
            d = a
            a = b
            b = d % b
            d = p
            p = q
            q = d - c * q
        invf[n] = p + self.MOD if p < 0 else p
        for i in range(n - 1, -1, -1):
            invf[i] = invf[i + 1] * (i + 1) % self.MOD
        return f, invf

    def run(self):
        self.solve()
        if not sys.stdin:
            sys.stdout.buffer.write(self.output_buffer.getvalue())

    def ni(self):
        num = 0
        minus = False
        while True:
            b = self.read_byte()
            if (b == ord('-')):
                minus = True
                continue
            if ord('0') <= b <= ord('9'):
                num = num * 10 + (b - ord('0'))
            else:
                return -num if minus else num

    def read_byte(self):
        return self.input_buffer.read(1)[0]

    def out(self, output):
        output = str(output).encode()
        self.output_buffer.write(output)

if __name__ == "__main__":
    P03039().run()