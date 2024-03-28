class main:
    import sys
    import math
    
    class Solver:
    
        def calc(self, n, st):
            ans = 1
            val = st
            while val < n:
                val *= 2
                ans *= 2
            return ans
    
        def solve(self, n, k):
            ans = 0.0
            for i in range(1, n + 1):
                cnt = self.calc(k, i)
                wk = 1 / (cnt * n)
                ans += wk
            return ans
    
    if __name__ == "__main__":
        n, k = map(int, input().split())
        solver = Solver()
        result = solver.solve(n, k)
        print("{:.15f}".format(result))