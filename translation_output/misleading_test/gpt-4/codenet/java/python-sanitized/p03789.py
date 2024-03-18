class BigInt:
    MOD = 100000000
    
    def __init__(self, number=None):
        if isinstance(number, str):
            sn = len(number)
            revint = [0] * (sn + 64)
            for i in range(sn):
                revint[i] = int(number[sn - 1 - i])
            
            n = (sn + 7) // 8 + 4
            self.w = [0] * n
            for i in range(n):
                fr = (i + 1) * 8 - 1
                to = i * 8
                for l in range(fr, to - 1, -1):
                    self.w[i] *= 10
                    self.w[i] += revint[l] if l >= 0 else 0
        elif isinstance(number, list):
            self.w = number.copy()

    def clone(self):
        return BigInt(self.w)
    
    def digit_sum(self):
        return sum(self._digit_sum(wi) for wi in self.w)
    
    def _digit_sum(self, wi):
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
    
    def add(self, n):
        self.w[0] += n
        for i in range(len(self.w) - 1):
            if self.w[i] < self.MOD:
                break
            up = self.w[i] // self.MOD
            self.w[i] %= self.MOD
            self.w[i + 1] += up


def solve(N):
    bigint = BigInt(N)
    bigint.multiply(9)
    n = len(N)
    
    ok = n * 10
    ng = 0
    while abs(ok - ng) > 1:
        med = (ok + ng) // 2
        if can_make(med, bigint.clone()):
            ok = med
        else:
            ng = med
    return (ok + 8) // 9


def can_make(n, bigint):
    bigint.add(n)
    return bigint.digit_sum() <= n


# Sample Test
if __name__ == "__main__":
    print(solve("80"))  # Expected Output: 97