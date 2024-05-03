Here is the Python version of the provided Java code:

```python
class ModInt:
    MOD = 1000000007

    def __init__(self, x):
        self.x = x % self.MOD

    def add(self, mi):
        return ModInt((self.x + mi.x) % self.MOD)

    def mul(self, i):
        return ModInt((self.x * i) % self.MOD)

    def mul(self, mi):
        return ModInt((self.x * mi.x) % self.MOD)

    def pow(self, p):
        res = ModInt(1)
        tmp = self
        while p > 0:
            if (p & 1) == 1:
                res = res.mul(tmp)
            tmp = tmp.mul(tmp)
            p //= 2
        return res

    def inv(self):
        return self.pow(self.MOD - 2)

    def __str__(self):
        return str(self.x)


class ModComb:
    def __init__(self, n):
        self.size = n
        self.fac = [ModInt(1)] * (n + 1)
        self.inv = [ModInt(1)] * (n + 1)

    def make_fac(self):
        for i in range(1, self.size + 1):
            self.fac[i] = self.fac[i - 1].mul(i)
            self.inv[i] = self.fac[i].inv()

    def comb_fac(self, n, k):
        if n < k:
            return ModInt(0)
        return self.fac[n].mul(self.inv[k]).mul(self.inv[n - k])


class ABC042DIrohaandaGrid:
    def solve(self, test_number, inp, out):
        h = inp.nextInt()
        w = inp.nextInt()
        a = inp.nextInt()
        b = inp.nextInt()
        mc = ModComb(200005)
        
