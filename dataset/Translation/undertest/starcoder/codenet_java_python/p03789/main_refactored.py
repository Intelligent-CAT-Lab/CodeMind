class main:
    import sys
    
    def solve(N):
        n = len(N)
        bigint = BigInt(N)
        bigint.multiply(9)
    
        ok = n * 10
        ng = 0
        while abs(ok - ng) > 1:
            med = (ok + ng) / 2
            if canMake(med, bigint.clone()):
                ok = med
            else:
                ng = med
    
        return (ok + 8) / 9
    
    def canMake(n, bigint):
        bigint.add(n)
        return bigint.digitSum() <= n
    
    class BigInt:
        def __init__(self, N):
            self.w = []
            self.MOD = 100000000
            self.w = self.convert(N)
    
        def convert(self, N):
            sn = len(N)
            revint = [0] * (sn+64)
            for i in range(sn):
                revint[i] = (ord(N[sn-1-i]) - ord('0'))
    
            n = (sn + 7) / 8 + 4
            w = [0] * n
            for i in range(n):
                fr = (i+1)*8-1
                to = i*8
                for l in range(fr, to-1, -1):
                    w[i] *= 10
                    w[i] += revint[l]
    
            return w
    
        def clone(self):
            big = BigInt(self.w)
            return big
    
        def digitSum(self):
            sum = 0
            for wi in self.w:
                sum += self.digitSum(wi)
            return sum
    
        def digitSum(self, wi):
            w = 0
            while wi >= 1:
                w += wi % 10
                wi /= 10
            return w
    
        def multiply(self, n):
            c = 0
            for i in range(len(self.w)):
                self.w[i] *= n
                self.w[i] += c
                c = self.w[i] / self.MOD
                self.w[i] %= self.MOD
    
        def add(self, n):
            self.w[0] += n
            for i in range(len(self.w)-1):
                if self.w[i] < self.MOD:
                    break
                up = self.w[i] / self.MOD
                self.w[i] %= self.MOD
                self.w[i+1] += up
    
    def main():
        in_ = InputReader(sys.stdin)
        out = PrintWriter(sys.stdout)
    
        N = in_.nextToken().strip()
        out.println(solve(N))
        out.flush()
    
    class InputReader:
        def __init__(self, stream):
            self.stream = stream
            self.buffer = ""
            self.curChar = None
            self.numChars = 0
    
        def next(self):
            if self.numChars == -1:
                raise InputMismatchException()
            if self.curChar >= self.numChars:
                self.curChar = 0
                self.buffer = self.stream