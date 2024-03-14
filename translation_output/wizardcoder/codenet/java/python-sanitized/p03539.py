import sys

MOD = 1000000007

def cnt(a, n, k, sum):
    if a == n:
        return sum
    f = 0
    for i in range(k+1):
        f += cnt(a+1, n, k, sum+i)
    return f

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = ""

    def readline(self):
        while True:
            if "\n" in self.buffer:
                line, self.buffer = self.buffer.split("\n", 1)
                return line
            else:
                data = self.stream.read(1024)
                if not data:
                    return None
                self.buffer += data.decode()

    def read(self):
        line = self.readline()
        if line is None:
            return None
        return line.strip()

    def readint(self):
        return int(self.read())

    def readints(self):
        return list(map(int, self.read().split()))

def main():
    in_ = InputReader(sys.stdin.buffer)
    out = sys.stdout

    n = in_.readint()
    k = in_.readint()

    pownk1 = 1
    for i in range(n-1):
        pownk1 *= (k+1)
        pownk1 %= MOD
    total = 0
    for i in range(k+1):
        total += i * pownk1 % MOD
        total %= MOD
    total *= n
    total %= MOD

    maxha = 100000
    dp = [[0]*(maxha+1) for _ in range(n+1)]
    dp[n][0] = 1

    for head in range(n, 0, -1):
        for ha in range(maxha+1):
            base = dp[head][ha]
            if base == 0:
                continue
            for l in range(k+1):
                if l <= head:
                    canha = (ha + l) // head
                    dp[head-1][ha+canha] += base
                    dp[head-1][ha+canha] %= MOD
                else:
                    dp[head-1][ha] += base
                    dp[head-1][ha] %= MOD

    for i in range(maxha+1):
        dec = dp[0][i] * i % MOD
        total += MOD-dec
        total %= MOD

    out.write(str(total) + "\n")
    out.flush()

if __name__ == '__main__':
    main()