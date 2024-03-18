```python
import sys
import math

class ERoaming:
    def __init__(self):
        self.fact = []
        self.factinv = []
        self.mod = 1000000007
        self.n = 0

    def gen(self):
        self.fact = [0] * (self.n + 1)
        self.factinv = [0] * (self.n + 1)
        self.fact[0] = 1
        self.factinv[0] = self.power(self.fact[0], self.mod - 2, self.mod)
        for i in range(1, self.n + 1):
            self.fact[i] = i * self.fact[i - 1] % self.mod
            self.factinv[i] = self.power(self.fact[i], self.mod - 2, self.mod)

    def solve(self, test_number, n, k):
        self.n = n
        if k >= n:
            return self.nCrs(n + n - 1, n - 1, self.mod)
        else:
            ans = 0
            self.gen()
            for i in range(k + 1):
                up = self.fact[n] * self.fact[n - 1] % self.mod
                den1 = self.factinv[i] * self.factinv[i] % self.mod
                den2 = self.factinv[n - i] * self.factinv[n - i - 1] % self.mod
                den = den1 * den2 % self.mod
                ans += up * den % self.mod
            return ans % self.mod

    @staticmethod
    def nCrs(n, r, p):
        up = 1
        down = 1
        for i in range(n - r + 1, n + 1):
            up *= i
            up %= p
        for i in range(1, r + 1):
            down *= i
            down %= p
        return (up * ERoaming.power(down, p - 2, p)) % p

    @staticmethod
    def power(x, y, p):
        res = 1
        x = x % p
        while y > 0:
            if y & 1:
                res = (res * x) % p
            y = y >> 1
            x = (x * x) % p
        return res

def main():
    input_func = sys.stdin.readline
    n, k = map(int, input_func().split())
    solver = ERoaming()
    res = solver.solve(1, n, k)
    print(res)

if __name__ == "__main__":
    main()
```

