Here is the Python version of the provided Java code:

```python
import sys

class p02685:
    def modPow(self, a, p, m):
        if a == 1: return 1
        ans = 1
        while p > 0:
            if p % 2 == 1: ans = (ans * a) % m
            a = (a * a) % m
            p >>= 1
        return ans

    def modInv(self, a, m):
        return self.modPow(a, m - 2, m)

    def run(self):
        n = int(sys.stdin.readline())
        m = int(sys.stdin.readline())
        k = int(sys.stdin.readline())
        ans = 0
        self.fact = [1]*(n+1)
        self.ifact = [1]*(n+1)
        for i in range(1, n+1):
            self.fact[i] = (self.fact[i-1] * i) % 998244353
            self.ifact[i] = self.modInv(self.fact[i], 998244353)
        for i in range(k+1):
            ans = (ans + (m * self.mul(m, self.modPow(m-1, n-(i+1), 998244353), self.NcR(n-1, i)))) % 998244353
        print(ans)

    def NcR(self, n, r):
        return self.mul(self.fact[n], self.mul(self.ifact[r], self.ifact[n-r]))

    def mul(self, a, b):
        return (a * b) % 998244353

    def add(self, a, b):
        return (a + b) % 998244353

if __name__ == "__main__":
    p02685().run()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the NCR (n choose r) for each r from 0 to k
