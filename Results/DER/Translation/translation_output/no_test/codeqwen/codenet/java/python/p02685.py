Here is the Python translation of the Java code:

```python
import sys
import math

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
        sys.stdin = open(0)
        # sc = Scanner(sys.stdin)
        #  Random sc=new Random();
        out = sys.stdout

        # credit goes to Stefan Dascalescu
        # https://www.youtube.com/watch?v=iYS8l9_A-vY

        n = int(input())
        m = int(input())
        k = int(input())
        ans = 0
        self.fact = [0]*(n+1)
        self.ifact = [0]*(n+1)
        self.fact[0] = self.fact[1] = self.ifact[0] = self.ifact[1] = 1
        for i in range(1, n+1):
            self.fact[i] = self.mul(self.fact[i-1], i)
            self.ifact[i] = self.modInv(self.fact[i], self.mod)
        for i in range(k+1):
            ans = self.add(ans, self.mul(m, self.mul(self.modPow(m-1, n-(i+1), self.mod), self.NcR(n-1, i))))
        print(ans)

    def NcR(self, n, r):
        return self.mul(self.fact[n], self.mul(self.ifact[r], self.ifact[n-r]))

    def sub(self, a, b):
        a %= self.mod
