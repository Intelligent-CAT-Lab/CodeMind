def nCrs(n, r, p):
    # r is small
    up = 1
    down = 1
    for i in range(n - r + 1, n + 1):
        up *= i
        up %= p
    for i in range(1, r + 1):
        down *= i
        down %= p
    return (up * power(down, p - 2, p)) % p

def power(x, y, p):
    res = 1
    x = x % p
    while y > 0:
        if (y & 1) == 1:
            res = (res * x) % p
        y = y >> 1
        x = (x * x) % p
    return res

class ERoaming:
    def __init__(self, n):
        self.fact = [0] * (n + 1)
        self.factinv = [0] * (n + 1)
        self.mod = 10**9 + 7
        self.n = n
    
    def gen(self):
        self.fact[0] = 1
        self.factinv[0] = power(self.fact[0], self.mod - 2, self.mod)
        for i in range(1, self.n + 1):
            self.fact[i] = i * self.fact[i - 1] % self.mod
            self.factinv[i] = power(self.fact[i], self.mod - 2, self.mod)
    
    def solve(self, k):
        if k >= self.n:
            return nCrs(self.n + self.n - 1, self.n - 1, self.mod)
        else:
            ans = 0
            self.gen()
            for i in range(k + 1):
                up = self.fact[self.n] * self.fact[self.n - 1] % self.mod
                den1 = self.factinv[i] * self.factinv[i] % self.mod
                den2 = self.factinv[self.n - i] * self.factinv[self.n - i - 1] % self.mod
                den = den1 * den2 % self.mod
                ans += up * den
                ans %= self.mod
            return ans

# Taking inputs
n, k = map(int, input().split())

solver = ERoaming(n)
print(solver.solve(k))