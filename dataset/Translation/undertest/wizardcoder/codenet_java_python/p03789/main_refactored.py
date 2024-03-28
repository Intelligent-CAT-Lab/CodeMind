class main:
    class BigInt:
        def __init__(self, str):
            self.w = []
            self.MOD = 100000000
            sn = len(str)
            revint = [0] * (sn+64)
            for i in range(sn):
                revint[i] = int(str[sn-1-i])
            n = (sn + 7) // 8 + 4
            self.w = [0] * n
            for i in range(n):
                fr = (i+1)*8-1
                to = i*8
                for l in range(fr, to-1, -1):
                    self.w[i] *= 10
                    self.w[i] += revint[l]
    
        def __str__(self):
            return str(self.w)
    
        def digitSum(self):
            return sum(self.digitSum(wi) for wi in self.w)
    
        def digitSum(self, wi):
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
                c = self.w[i] // self.MOD
                self.w[i] %= self.MOD
            if c > 0:
                self.w.append(c)
    
        def add(self, n):
            self.w[0] += n
            for i in range(len(self.w)-1):
                if self.w[i] < self.MOD:
                    break
                up = self.w[i] // self.MOD
                self.w[i] %= self.MOD
                self.w[i+1] += up
            if self.w[-1] >= self.MOD:
                self.w[-1] -= self.MOD
                self.w.append(1)
    
        def clone(self):
            big = BigInt('')
            big.w = self.w.copy()
            return big
    
    def canMake(n, bigint):
        big = bigint.clone()
        big.add(n)
        return big.digitSum() <= n
    
    def solve(N):
        n = len(N)
        bigint = BigInt(N)
        bigint.multiply(9)
    
        ok = n * 10
        ng = 0
        while abs(ok - ng) > 1:
            med = (ok + ng) // 2
            if canMake(med, bigint):
                ok = med
            else:
                ng = med
    
        return (ok + 8) // 9
    
    def main():
        in_ = InputReader(sys.stdin)
        out = sys.stdout
    
        N = in_.nextChar()
        out.write(str(solve(N)))
        out.flush()
    
    if __name__ == '__main__':
        main()