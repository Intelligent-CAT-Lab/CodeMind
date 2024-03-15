Here's the Java code translated into Python:

```python
MOD = 1000000007

class ModInt:
    def __init__(self, l):
        self.x = l % MOD

    def add(self, mi):
        return ModInt(self.x + mi.x)

    def mul(self, other):
        if isinstance(other, ModInt):
            return ModInt(self.x * other.x)
        else:
            return ModInt(self.x * other)

    def pow(self, p):
        res = ModInt(1)
        tmp = self
        while p > 0:
            if p & 1:
                res = res.mul(tmp)
            tmp = tmp.mul(tmp)
            p //= 2
        return res

    def inv(self):
        return self.pow(MOD - 2)

    def __str__(self):
        return str(self.x)


class ModComb:
    def __init__(self, n):
        self.size = n
        self.fac = [ModInt(0)] * (n + 1)
        self.inv = [ModInt(0)] * (n + 1)

    def makeFac(self):
        for i in range(self.size + 1):
            if i == 0:
                self.fac[i] = ModInt(1)
            else:
                self.fac[i] = self.fac[i - 1].mul(i)
            self.inv[i] = self.fac[i].inv()

    def combFac(self, n, k):
        if n < k:
            return ModInt(0)
        return self.fac[n].mul(self.inv[k]).mul(self.inv[n - k])


def solve(h, w, a, b):
    mc = ModComb(200005)
    mc.makeFac()
    res = ModInt(0)
    for i in range(h - a):
        res = res.add(mc.combFac(b - 1 + i, i).mul(mc.combFac(w - b - 1 + h - 1 - i, h - 1 - i)))
    return str(res)


if __name__ == '__main__':
    h, w, a, b = map(int, input().split())
    result = solve(h, w, a, b)
    print(result)
```

This Python code provides equivalent functionality to the original Java code. The `ModInt` and `ModComb` classes have been translated, and the main `solve` function has been adapted to work as a standalone function that you can call with the input variables `h`, `w`, `a`, and `b`. Note that the `Scanner` and `PrintWriter` are replaced by Python's built-in `input()` function and `print()` function respectively, which are common for handling input and output in Python scripting.
