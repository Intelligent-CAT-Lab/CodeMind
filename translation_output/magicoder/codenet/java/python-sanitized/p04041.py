import sys
import time
import math

class p04041:
    def __init__(self):
        self.INPUT = ""
        self.MOD = 1000000007
        self.inf = int(1e9)

    def solve(self):
        n = self.ni()
        x = self.ni()
        y = self.ni()
        z = self.ni()
        sum = x+y+z+1
        mask = 1<<sum
        mask -= 1
        dp = [[0]*(mask+1) for _ in range(n+1)]
        ng = 0
        ng |= 1<<z
        ng |= 1<<(y+z)
        ng |= 1<<(x+y+z)
        dp[0][1] = 1
        for i in range(n):
            for state in range(mask+1):
                for j in range(1, 11):
                    res = ((state<<j)&mask) + 1
                    if(res&ng)==ng: continue
                    dp[i+1][res] += dp[i][state]
                    dp[i+1][res] %= self.MOD
        ans = 1
        for i in range(n):
            ans *= 10
            ans %= self.MOD
        for i in range(mask+1):
            ans -= dp[n][i]
            ans %= self.MOD
        print((ans+self.MOD)%self.MOD)

    def run(self):
        if self.INPUT:
            sys.stdin = open(self.INPUT)
        self.out = sys.stdout
        s = time.time()
        self.solve()
        self.out.flush()
        if self.INPUT:
            print(time.time()-s, "ms")

    def read_int(self):
        return int(sys.stdin.readline())

    def read_ints(self):
        return list(map(int, sys.stdin.readline().split()))

    def read_str(self):
        return sys.stdin.readline