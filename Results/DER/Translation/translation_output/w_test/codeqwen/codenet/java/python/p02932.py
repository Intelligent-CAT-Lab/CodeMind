Here is the Python version of the provided Java code:

```python
import sys
import math
import random

class Modular:
    def __init__(self, m):
        self.m = m

    def valueOf(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x

    def mul(self, x, y):
        return self.valueOf(x * y)

    def plus(self, x, y):
        return self.valueOf(x + y)

    def subtract(self, x, y):
        return self.valueOf(x - y)

class BitOperator:
    def bitAt(self, x, i):
        return (x >> i) & 1

    def setBit(self, x, i, v):
        if v:
            x |= 1 << i
        else:
            x &= ~(1 << i)
        return x

    def swapBit(self, x, i, j):
        bi = self.bitAt(x, i)
        bj = self.bitAt(x, j)
        x = self.setBit(x, i, bj == 1)
        x = self.setBit(x, j, bi == 1)
        return x

class Power:
    def __init__(self, modular):
        self.modular = modular

    def pow(self, x, n):
        if n == 0:
            return 1
        r = self.pow(x, n >> 1)
        r = self.modular.valueOf(r * r)
        if (n & 1) == 1:
            r = self.modular.valueOf(r * x)
        return r

    def inverse(self, x):
        return self.pow(x, self.modular.m - 2)

class Log2:
    def ceilLog(self, x):
        return 32 - int(math.log2(x - 1))

    def floorLog(self, x):
        return 31 - int(math.log2(x))

class InverseNumber:
    
