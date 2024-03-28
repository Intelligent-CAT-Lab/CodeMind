```python
import sys

class p03039:
    def __init__(self):
        self.INPUT = ''
        self.mod = 998244353
        self.inf = sys.maxsize // 2
        self.fif = self.enumFIF(1000000, self.mod)

    def solve(self):
        n, m, k = map(int, input().split())
        self.mod = 1000000007

        xsum = 0
        ysum = 0

        xa = self.C(n*m-2, k-2, self.mod) * self.fif[0][k-2] % self.mod
        xb = 0
        for i in range(m):
            tmp = (i * (m-i) % self.mod * n % self.mod * n % self.mod * 2 % self.mod)
            xb += tmp
            xb %= self.mod

        xc = xa * xb % self.mod * self.C(k, 2, self.mod) % self.mod
        xsum = xc * self.fif[1][k] % self.mod

        ya = self.C(n*m-2, k-2, self.mod) * self.fif[0][k-2] % self.mod
        yb = 0
        for i in range(n):
            tmp = (i * (n-i) % self.mod * m % self.mod * m % self.mod * 2 % self.mod)
            yb += tmp
            yb %= self.mod

        yc = ya * yb % self.mod * self.C(k, 2, self.mod) % self.mod
        ysum = yc * self.fif[1][k] % self.mod

        print((xsum+ysum) % self.mod)

    def C(self, n, r, mod):
        if n < 0 or r < 0 or r > n:
            return 0
        return (self.fif[0][n] * self.fif[1][r] % mod * self.fif[1][n - r] % mod)

    def enumFIF(self, n, mod):
        f = [0] * (n + 1)
        invf = [0] * (n + 1)
        f[0] = 1
        for i in range(1, n + 1):
            f[i] = f[i - 1] * i % mod

        a = f[n]
        b = mod
        p, q = 1, 0
        while b > 0:
            c = a // b
            d = a
            a = b
            b = d % b
            d = p
            p = q
            q = d - c * q

        invf[n] = p + mod if p < 0 else p
        for i in range(n - 1, -1, -1):
            invf[i] = invf[i + 1] * (i + 1) % mod

        return [f, invf]

def main():
    p = p03039()
    p.solve()

if __name__ == '__main__':
    main()
```

