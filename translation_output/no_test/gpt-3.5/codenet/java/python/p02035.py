```python
import sys
import io
import array
import math
input = io.BytesIO()
print = io.TextIOWrapper(io.BytesIO(), sys.stdout).write
sys.stdin = io.TextIOWrapper(input, sys.stdin.encoding)

class FRedBlackSoulGem:
    def solve(self, testNumber: int, in_stream, out_stream):
        n = in_stream.ints()
        m = in_stream.ints()
        mod = ModMath(m)
        ans = 0
        exp2 = mod.getExponentiation(2, n)
        
        for r in range(1, n):
            b = n - r
            t = mod.ncr(n, r)
            t *= mod.pow(2, r * (r - 1) // 2)
            t %= m
            t *= mod.pow(2, b * (b - 1) // 2)
            t %= m
            
            p = 0
            fact = mod.getFactorial(b + 1)
            
            for i in range(b + 1):
                if i % 2 == 0:
                    p += fact.ncr(b, i) * mod.pow(exp2.pow(b - i) - 1, r) % m
                    p %= m
                else:
                    p -= fact.ncr(b, i) * mod.pow(exp2.pow(b - i) - 1, r) % m
                    p %= m
            
            if p < 0:
                p += m
                
            t *= p
            t %= m
            ans += t
            ans %= m
        
        out_stream.ans(ans).ln()

class LightScanner:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = []

    def string(self):
        if not self.tokenizer or len(self.tokenizer) == 0:
            self.tokenizer = self.reader.readline().split()
        return self.tokenizer.pop(0)

    def ints(self):
        return int(self.string())

class ModMath:
    DEFAULT_MOD = 1_000_000_007
    
    def __init__(self, mod=DEFAULT_MOD):
        self.mod = mod

    def mod(self, x):
        x %= self.mod
        return x + self.mod if x < 0 else x

    def inv(self, x):
        return self.mod(LongEuclidSolver.solve(x, -self.mod).x)

    def pow(self, x, y):
        if y < 0:
            return self.pow(self.inv(x), -y)
        elif y == 0:
            return 1
        elif y % 2 == 0:
            z = self.pow(x, y // 2)
            return z * z % self.mod
        else:
            return (x % self.mod) * self.pow(x, y - 1) % self.mod

    def npr(self, n, r):
        if n < r:
            return 0
        ans = 1
        for i in range(r):
            ans *= (n - i)
            ans %= self.mod
        return ans

    def ncr(self, n, r):
        div = 1
        for i in range(2, r + 1):
            div *= i
            div %= self.mod
        return self.mod(self.npr(n, r) * self.inv(div))

    def getFactorial(self, n):
        return Factorial(self, n)

    def getExponentiation(self, base, max):
        return Exponentiation(self, base, max)

class LongEuclidSolver:
    @staticmethod
    def solve(p, q):
        if q == 0:
            return Vec3l(p, 1, p)
        vals = LongEuclidSolver.solve(q, p % q)
        a = vals.y
        b = vals.x - (p // q) * a
        return Vec3l(a, b, vals.z)

class Factorial:
    def __init__(self, mod, max):
        self.mod = mod
        self.max = max
        self.natural = [0] * max
        self.reverse = [0] * max
        self.natural[0] = 1
        for i in range(1, max):
            self.natural[i] = mod.mod(self.natural[i - 1] * i)
        self.reverse[max - 1] = mod.inv(self.natural[max - 1])
        for i in range(max - 1, 0, -1):
            self.reverse[i - 1] = mod.mod(self.reverse[i] * i)

    def npr(self, n, r):
        return self.mod.mod(self.natural[n] * self.reverse[n - r])

    def ncr(self, n, r):
        return self.mod.mod(self.npr(n, r) * self.reverse[r])

class Exponentiation:
    def __init__(self, mod, base, max):
        self.mod = mod
        self.base = base
        self.max = max
        self.natural = [0] * max
        self.reverse = [0] * max
        self.natural[0] = 1
        for i in range(1, max):
            self.natural[i] = mod.mod(self.natural[i - 1] * base)
        self.reverse[max - 1] = mod.inv(self.natural[max - 1])
        for i in range(max - 1, 0, -1):
            self.reverse[i - 1] = mod.mod(self.reverse[i] * base)

    def pow(self, x):
        if x >= 0:
            return self.natural[x]
        else:
            return self.reverse[-x]

class Vec3l:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z

    def __eq__(self, o):
        return self.x == o.x and self.y == o.y and self.z == o.z

    def __hash__(self):
        return hash((self.x, self.y, self.z))

    def __str__(self):
        return f"({self.x}, {self.y}, {self.z})"

test_input = "5 1000"
input.write(test_input.encode())
input.seek(0)

in_stream = LightScanner(sys.stdin)
out_stream = LightWriter(sys.stdout)
solver = FRedBlackSoulGem()
solver.solve(1, in_stream, out_stream)
out_stream.close()
```

