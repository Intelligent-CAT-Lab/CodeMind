class main:
    import io
    import os
    import sys
    
    
    class Solution:
        def __init__(self):
            self.mod = 998244353
            self.fact = None
            self.ifact = None
    
        def mod_pow(self, a, p, m):
            if a == 1:
                return 1
            ans = 1
            while p > 0:
                if p % 2 == 1:
                    ans = (ans * a) % m
                a = (a * a) % m
                p >>= 1
            return ans
    
        def mod_inv(self, a, m):
            return self.mod_pow(a, m - 2, m)
    
        def NcR(self, n, r):
            return self.mul(self.fact[n], self.mul(self.ifact[r], self.ifact[n - r]))
    
        def sub(self, a, b):
            return ((a % self.mod - b % self.mod) + self.mod) % self.mod
    
        def mul(self, a, b):
            return (a % self.mod * b % self.mod) % self.mod
    
        def add(self, a, b):
            return (a % self.mod + b % self.mod) % self.mod
    
        def run(self):
            n, m, k = map(int, input().split())
            ans = 0
            self.fact = [1] * (n + 1)
            self.ifact = [1] * (n + 1)
            for i in range(2, n + 1):
                self.fact[i] = self.mul(self.fact[i - 1], i)
                self.ifact[i] = self.mod_inv(self.fact[i], self.mod)
            for i in range(k + 1):
                ans = self.add(
                    ans, self.mul(m, self.mul(self.mod_pow(m - 1, n - (i + 1), self.mod), self.NcR(n - 1, i)))
                )
            print(ans)
    
    
    if __name__ == "__main__":
        Solution().run()