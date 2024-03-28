```python
mod = 1000000007

class Combinatrics:
    
    def __init__(self, n):
        self.fact = [0]*(n+1)
        self.inv = [0]*(n+1)
        self.finv = [0]*(n+1)
        self.fact[0] = self.fact[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        for i in range(2, n+1):
            self.fact[i] = self.fact[i-1] * i % mod
            self.inv[i] = mod - self.inv[mod % i] * (mod // i) % mod
            self.finv[i] = self.finv[i-1] * self.inv[i] % mod
    
    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[r] % mod * self.finv[n-r] % mod)
        

class FastScanner:
    
    def nextInt(self):
        return int(input())
        

if __name__ == "__main__":
    comb = Combinatrics(1000)
    fs = FastScanner()
    
    n = fs.nextInt()
    k = fs.nextInt()
    
    print(comb.combination(k, n))
```

