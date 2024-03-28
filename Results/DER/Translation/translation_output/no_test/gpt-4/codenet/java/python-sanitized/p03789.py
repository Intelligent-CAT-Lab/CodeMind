class BigInt:
    MOD = 100000000

    def __init__(self, w_or_str):
        if isinstance(w_or_str, list):
            self.w = w_or_str[:]
        elif isinstance(w_or_str, str):
            sn = len(w_or_str)
            revint = [0] * (sn + 64)
            for i in range(sn):
                revint[i] = int(w_or_str[sn - 1 - i])
            
            n = (sn + 7) // 8 + 4
            self.w = [0] * n
            for i in range(n):
                fr = (i + 1) * 8 - 1
                to = i * 8
                for l in range(fr, to - 1, -1):
                    self.w[i] *= 10
                    self.w[i] += revint[l] if l >= 0 else 0

    def clone(self):
        return BigInt(self.w)

    def digit_sum(self):
        return sum(self._digit_sum(wi) for wi in self.w)

    def _digit_sum(self, wi):
        s = 0
        while wi >= 1:
            s += wi % 10
            wi //= 10
        return s

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
            up, self.w[i] = divmod(self.w[i], self.MOD)
            self.w[i + 1] += up


def can_make(n, bigint):
    bigint.add(n)
    return bigint.digit_sum() <= n


def solve(N):
    n = len(N)
    bigint = BigInt(N)
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


# Since Python doesn't have a direct equivalent to Java's InputStream and PrintWriter,
# we will simply read input from standard input and print output to standard output.

def main():
    s = input().strip()
    print(solve(s))


if __name__ == '__main__':
    main()