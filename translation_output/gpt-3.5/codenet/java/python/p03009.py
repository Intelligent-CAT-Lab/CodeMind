```python
import sys

class FastInput:
    def __init__(self, is):
        self.buf = bytearray()
        self.bufLen = 0
        self.bufOffset = 0
        self.next = -1
        self.is = is
    
    def read(self):
        while self.bufLen == self.bufOffset:
            self.bufOffset = 0
            self.buf = self.is.read(1 << 13)
            self.bufLen = len(self.buf)
            if self.bufLen == 0:
                return -1
        self.next = self.buf[self.bufOffset]
        self.bufOffset += 1
        return self.next
    
    def skipBlank(self):
        while self.next >= 0 and self.next <= 32:
            self.read()
    
    def readInt(self):
        sign = 1
        self.skipBlank()
        if self.next == 43 or self.next == 45:
            sign = 1 if self.next == 43 else -1
            self.read()
        
        val = 0
        if sign == 1:
            while self.next >= 48 and self.next <= 57:
                val = val * 10 + self.next - 48
                self.read()
        else:
            while self.next >= 48 and self.next <= 57:
                val = val * 10 - self.next + 48
                self.read()
        
        return val

class NumberTheory:
    class Modular:
        def __init__(self, m):
            self.m = m
        
        def valueOf(self, x):
            x %= self.m
            if x < 0:
                x += self.m
            return x
        
        def mul(self, x, y):
            return self.valueOf((x * y) % self.m)
        
        def plus(self, x, y):
            return self.valueOf(x + y)
        
        def subtract(self, x, y):
            return self.valueOf(x - y)
    
    class Factorial:
        def __init__(self, n, mod):
            self.modular = mod
            self.fact = [1] * (n + 1)
            self.inv = [1] * (n + 1)
            self.factSum = 0
            for i in range(1, n + 1):
                self.factSum = mod.plus(self.factSum, self.fact[i])
    
    class InverseNumber:
        def __init__(self, inv, limit, modular):
            inv[1] = 1
            p = modular.m
            for i in range(2, limit + 1):
                k = p // i
                r = p % i
                inv[i] = modular.mul(-k, inv[r])
    
    class TaskE:
        def solve(self, testNumber, in_obj, out_obj):
            n = in_obj.readInt()
            h = in_obj.readInt()
            d = in_obj.readInt()
            mod = NumberTheory.Modular(int(1e9) + 7)
            fact = NumberTheory.Factorial(n, mod)
            
            dp = [0] * (h + 1)
            dp[0] = fact.fact[n]
            factSum = fact.factSum
            
            preDpSum = [0] * (h + 1)
            preDpSum[0] = dp[0]
            
            for i in range(1, h + 1):
                dp[i] = preDpSum[i - 1]
                if i - d - 1 >= 0:
                    dp[i] = mod.subtract(dp[i], preDpSum[i - d - 1])
                if i < h:
                    dp[i] = mod.mul(dp[i], factSum)
                preDpSum[i] = mod.plus(preDpSum[i - 1], dp[i])
    
            out_obj.println(dp[h])
    
class FastOutput:
    def __init__(self, os):
        self.cache = []
        self.os = os
    
    def println(self, c):
        self.cache.append(str(c) + '\n')
        return self
    
    def flush(self):
        self.os.write(''.join(self.cache))
        self.os.flush()
        self.cache = []
    
    def close(self):
        self.flush()
        self.os.close()

def main():
    in_obj = FastInput(sys.stdin.buffer)
    out_obj = FastOutput(sys.stdout)
    
    solver = NumberTheory.TaskE()
    solver.solve(1, in_obj, out_obj)
    
    out_obj.close()

if __name__ == "__main__":
    main()
```
```
