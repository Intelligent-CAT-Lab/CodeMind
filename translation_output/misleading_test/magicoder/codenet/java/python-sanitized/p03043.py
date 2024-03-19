import sys

class Solver:
    def calc(self, n, st):
        ans = 1
        val = st
        while val < n:
            val *= 2
            ans *= 2
        return ans

    def solve(self, N, K):
        cnt = 0
        wk = 0
        ans = 0
        for i in range(1, N + 1):
            cnt = self.calc(K, i)
            wk = 1 / (