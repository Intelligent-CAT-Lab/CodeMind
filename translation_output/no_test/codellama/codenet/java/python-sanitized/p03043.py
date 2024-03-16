import sys
import math

class Solver:
    def solve(self, test_number, inp, out):
        N = inp.nextInt()
        K = inp.nextInt()
        ans = 0
        for i in range(1, N+1):
            cnt = self.calc(K, i, out)
            wk = 1 / (cnt * N)
            ans += wk
        out.println(ans)