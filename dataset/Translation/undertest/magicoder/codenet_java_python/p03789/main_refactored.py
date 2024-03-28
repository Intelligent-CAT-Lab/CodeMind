class main:
    class BigInt:
        def __init__(self, str):
            self.w = [int(c) for c in str[::-1]]
            self.MOD = 100000000
    
        def clone(self):
            return BigInt(self.w.copy())
    
        def digit_sum(self):
            return sum(self.digit_sum(wi) for wi in self.w)
    
        def digit_sum(self, wi):
            w = 0
            while wi >= 1:
                w += wi % 10
                wi //= 10
            return w
    
        def multiply(self, n):
            c = 0
            for i in range(len(self.w)):
                self.w[i] *= n
                self.w[i] += c
                c, self.w[i] = divmod(self.w[i], self.MOD)
    
        def add(self, n):
            self.w[0] += n
            for i in range(len(self.w) - 1):
                if self.w[i] < self.MOD:
                    break
                up = self.w[i] // self.MOD
                self.w[i] %= self.MOD
                self.w[i + 1] += up
    
    
    def solve(s):
        n = len(s)
        bigint = BigInt(s)
        bigint.multiply(9)
    
        ok = n * 10
        ng = 0
        while abs(ok - ng) > 1:
            med = (ok + ng) // 2
            if can_make(med, bigint.clone()):
                ok = med
            else:
                ng = med
        return (ok + 8) // 9
    
    
    def can_make(n