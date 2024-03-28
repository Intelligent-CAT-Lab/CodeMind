class main:
    import sys
    
    class ModInt:
        MOD = 1000000007
        def __init__(self, x):
            self.x = x % MOD
    
        def add(self, mi):
            return ModInt(self.x + mi.x)
    
        def mul(self, i):
            return ModInt(self.x * i)
    
        def mul(self, mi):
            return ModInt(self.x * mi.x)
    
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
            return str(int(self.x))
    
    class ModComb:
        def __init__(self, n):
            self.size = n
            self.fac = [ModInt(1)] * (n + 1)
            self.inv = [ModInt(1)] * (n + 1)
    
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
    
    class ABC042DIrohaandaGrid:
        def solve(self, testNumber, in, out):
            h = int(in.readline())
            w = int(in.readline())
            a = int(in.readline())
            b = int(in.readline())
            mc = ModComb(200005)
            mc.makeFac()
            res = ModInt(0)
            for i in range(h - a):
                res = res.add(mc.combFac(b - 1 + i, i).mul(mc.combFac(w - b - 1 + h - 1 - i, h - 1 - i)))
            out.write(str(res) + '\n')
    
    if __name__ == '__main__':
        ABC042DIrohaandaGrid().solve(1, sys.stdin, sys.stdout)